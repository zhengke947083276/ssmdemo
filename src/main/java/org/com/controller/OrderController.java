package org.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {
//    @Autowired
//    OrderService orderService;
//    @RequestMapping("/selectPage")
//    public String selectPage(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model,int shopper_id){
//        //引入pagehelper插件
//        //查询之前只需要调用，传入页码，以及每页的大小
//        PageHelper.startPage(pn,5);
//        //startPage后就是一个分页查询
//        List<Order> orders = orderService.getAll(1);
//        //使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行了
//        //封装了详细的分页信息，包括有我们查询出来的数据,c传入连续显示的页数
//        PageInfo page = new PageInfo(orders,5);
//        model.addAttribute("pageInfo",page);
//        return "order/main";
//    }
}
