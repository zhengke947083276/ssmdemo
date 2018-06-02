package org.com.view;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.com.entity.UserDemo;
import org.springframework.web.servlet.view.document.AbstractXlsView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

public class ViewExcel extends AbstractXlsView {
    @SuppressWarnings("unchecked")
    @Override
    protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String fileName = "用户列表excel.xls";
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/ms-excel");
        response.setHeader("Content-Disposition", "inline; filename="+new String(fileName.getBytes(),"iso8859-1"));
        OutputStream outputStream = response.getOutputStream();
        List<UserDemo> userDemos = (List<UserDemo>) model.get("userDemos");
        // 产生Excel表头
        Sheet sheet = workbook.createSheet("基本信息");
        Row row = sheet.createRow(0);
        // 产生标题列
        row.createCell(0).setCellValue("ID");
        row.createCell(1).setCellValue("名字");
        row.createCell(2).setCellValue("邮箱");
        row.createCell(3).setCellValue("密码");
        int rowNumber = 1;
        for (UserDemo userDemo : userDemos) {
            Row row1 = sheet.createRow(rowNumber++);
            // 产生标题列
            row1.createCell(0).setCellValue(userDemo.getId());
            row1.createCell(1).setCellValue(userDemo.getName());
            row1.createCell(2).setCellValue(userDemo.getEmail());
            row1.createCell(3).setCellValue(userDemo.getPassword());
        }
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
    }
}
