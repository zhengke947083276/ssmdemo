package org.com.entity;

import java.util.ArrayList;
import java.util.List;

public class TblShopperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblShopperExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andShopperIdIsNull() {
            addCriterion("shopper_Id is null");
            return (Criteria) this;
        }

        public Criteria andShopperIdIsNotNull() {
            addCriterion("shopper_Id is not null");
            return (Criteria) this;
        }

        public Criteria andShopperIdEqualTo(Integer value) {
            addCriterion("shopper_Id =", value, "shopperId");
            return (Criteria) this;
        }

        public Criteria andShopperIdNotEqualTo(Integer value) {
            addCriterion("shopper_Id <>", value, "shopperId");
            return (Criteria) this;
        }

        public Criteria andShopperIdGreaterThan(Integer value) {
            addCriterion("shopper_Id >", value, "shopperId");
            return (Criteria) this;
        }

        public Criteria andShopperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopper_Id >=", value, "shopperId");
            return (Criteria) this;
        }

        public Criteria andShopperIdLessThan(Integer value) {
            addCriterion("shopper_Id <", value, "shopperId");
            return (Criteria) this;
        }

        public Criteria andShopperIdLessThanOrEqualTo(Integer value) {
            addCriterion("shopper_Id <=", value, "shopperId");
            return (Criteria) this;
        }

        public Criteria andShopperIdIn(List<Integer> values) {
            addCriterion("shopper_Id in", values, "shopperId");
            return (Criteria) this;
        }

        public Criteria andShopperIdNotIn(List<Integer> values) {
            addCriterion("shopper_Id not in", values, "shopperId");
            return (Criteria) this;
        }

        public Criteria andShopperIdBetween(Integer value1, Integer value2) {
            addCriterion("shopper_Id between", value1, value2, "shopperId");
            return (Criteria) this;
        }

        public Criteria andShopperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shopper_Id not between", value1, value2, "shopperId");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumIsNull() {
            addCriterion("shopper_telnum is null");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumIsNotNull() {
            addCriterion("shopper_telnum is not null");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumEqualTo(String value) {
            addCriterion("shopper_telnum =", value, "shopperTelnum");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumNotEqualTo(String value) {
            addCriterion("shopper_telnum <>", value, "shopperTelnum");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumGreaterThan(String value) {
            addCriterion("shopper_telnum >", value, "shopperTelnum");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumGreaterThanOrEqualTo(String value) {
            addCriterion("shopper_telnum >=", value, "shopperTelnum");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumLessThan(String value) {
            addCriterion("shopper_telnum <", value, "shopperTelnum");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumLessThanOrEqualTo(String value) {
            addCriterion("shopper_telnum <=", value, "shopperTelnum");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumLike(String value) {
            addCriterion("shopper_telnum like", value, "shopperTelnum");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumNotLike(String value) {
            addCriterion("shopper_telnum not like", value, "shopperTelnum");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumIn(List<String> values) {
            addCriterion("shopper_telnum in", values, "shopperTelnum");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumNotIn(List<String> values) {
            addCriterion("shopper_telnum not in", values, "shopperTelnum");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumBetween(String value1, String value2) {
            addCriterion("shopper_telnum between", value1, value2, "shopperTelnum");
            return (Criteria) this;
        }

        public Criteria andShopperTelnumNotBetween(String value1, String value2) {
            addCriterion("shopper_telnum not between", value1, value2, "shopperTelnum");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordIsNull() {
            addCriterion("shopper_password is null");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordIsNotNull() {
            addCriterion("shopper_password is not null");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordEqualTo(String value) {
            addCriterion("shopper_password =", value, "shopperPassword");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordNotEqualTo(String value) {
            addCriterion("shopper_password <>", value, "shopperPassword");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordGreaterThan(String value) {
            addCriterion("shopper_password >", value, "shopperPassword");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("shopper_password >=", value, "shopperPassword");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordLessThan(String value) {
            addCriterion("shopper_password <", value, "shopperPassword");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordLessThanOrEqualTo(String value) {
            addCriterion("shopper_password <=", value, "shopperPassword");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordLike(String value) {
            addCriterion("shopper_password like", value, "shopperPassword");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordNotLike(String value) {
            addCriterion("shopper_password not like", value, "shopperPassword");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordIn(List<String> values) {
            addCriterion("shopper_password in", values, "shopperPassword");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordNotIn(List<String> values) {
            addCriterion("shopper_password not in", values, "shopperPassword");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordBetween(String value1, String value2) {
            addCriterion("shopper_password between", value1, value2, "shopperPassword");
            return (Criteria) this;
        }

        public Criteria andShopperPasswordNotBetween(String value1, String value2) {
            addCriterion("shopper_password not between", value1, value2, "shopperPassword");
            return (Criteria) this;
        }

        public Criteria andShopperSexIsNull() {
            addCriterion("shopper_sex is null");
            return (Criteria) this;
        }

        public Criteria andShopperSexIsNotNull() {
            addCriterion("shopper_sex is not null");
            return (Criteria) this;
        }

        public Criteria andShopperSexEqualTo(Boolean value) {
            addCriterion("shopper_sex =", value, "shopperSex");
            return (Criteria) this;
        }

        public Criteria andShopperSexNotEqualTo(Boolean value) {
            addCriterion("shopper_sex <>", value, "shopperSex");
            return (Criteria) this;
        }

        public Criteria andShopperSexGreaterThan(Boolean value) {
            addCriterion("shopper_sex >", value, "shopperSex");
            return (Criteria) this;
        }

        public Criteria andShopperSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shopper_sex >=", value, "shopperSex");
            return (Criteria) this;
        }

        public Criteria andShopperSexLessThan(Boolean value) {
            addCriterion("shopper_sex <", value, "shopperSex");
            return (Criteria) this;
        }

        public Criteria andShopperSexLessThanOrEqualTo(Boolean value) {
            addCriterion("shopper_sex <=", value, "shopperSex");
            return (Criteria) this;
        }

        public Criteria andShopperSexIn(List<Boolean> values) {
            addCriterion("shopper_sex in", values, "shopperSex");
            return (Criteria) this;
        }

        public Criteria andShopperSexNotIn(List<Boolean> values) {
            addCriterion("shopper_sex not in", values, "shopperSex");
            return (Criteria) this;
        }

        public Criteria andShopperSexBetween(Boolean value1, Boolean value2) {
            addCriterion("shopper_sex between", value1, value2, "shopperSex");
            return (Criteria) this;
        }

        public Criteria andShopperSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shopper_sex not between", value1, value2, "shopperSex");
            return (Criteria) this;
        }

        public Criteria andShopperAgeIsNull() {
            addCriterion("shopper_age is null");
            return (Criteria) this;
        }

        public Criteria andShopperAgeIsNotNull() {
            addCriterion("shopper_age is not null");
            return (Criteria) this;
        }

        public Criteria andShopperAgeEqualTo(Integer value) {
            addCriterion("shopper_age =", value, "shopperAge");
            return (Criteria) this;
        }

        public Criteria andShopperAgeNotEqualTo(Integer value) {
            addCriterion("shopper_age <>", value, "shopperAge");
            return (Criteria) this;
        }

        public Criteria andShopperAgeGreaterThan(Integer value) {
            addCriterion("shopper_age >", value, "shopperAge");
            return (Criteria) this;
        }

        public Criteria andShopperAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopper_age >=", value, "shopperAge");
            return (Criteria) this;
        }

        public Criteria andShopperAgeLessThan(Integer value) {
            addCriterion("shopper_age <", value, "shopperAge");
            return (Criteria) this;
        }

        public Criteria andShopperAgeLessThanOrEqualTo(Integer value) {
            addCriterion("shopper_age <=", value, "shopperAge");
            return (Criteria) this;
        }

        public Criteria andShopperAgeIn(List<Integer> values) {
            addCriterion("shopper_age in", values, "shopperAge");
            return (Criteria) this;
        }

        public Criteria andShopperAgeNotIn(List<Integer> values) {
            addCriterion("shopper_age not in", values, "shopperAge");
            return (Criteria) this;
        }

        public Criteria andShopperAgeBetween(Integer value1, Integer value2) {
            addCriterion("shopper_age between", value1, value2, "shopperAge");
            return (Criteria) this;
        }

        public Criteria andShopperAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("shopper_age not between", value1, value2, "shopperAge");
            return (Criteria) this;
        }

        public Criteria andShopperJobIsNull() {
            addCriterion("shopper_job is null");
            return (Criteria) this;
        }

        public Criteria andShopperJobIsNotNull() {
            addCriterion("shopper_job is not null");
            return (Criteria) this;
        }

        public Criteria andShopperJobEqualTo(String value) {
            addCriterion("shopper_job =", value, "shopperJob");
            return (Criteria) this;
        }

        public Criteria andShopperJobNotEqualTo(String value) {
            addCriterion("shopper_job <>", value, "shopperJob");
            return (Criteria) this;
        }

        public Criteria andShopperJobGreaterThan(String value) {
            addCriterion("shopper_job >", value, "shopperJob");
            return (Criteria) this;
        }

        public Criteria andShopperJobGreaterThanOrEqualTo(String value) {
            addCriterion("shopper_job >=", value, "shopperJob");
            return (Criteria) this;
        }

        public Criteria andShopperJobLessThan(String value) {
            addCriterion("shopper_job <", value, "shopperJob");
            return (Criteria) this;
        }

        public Criteria andShopperJobLessThanOrEqualTo(String value) {
            addCriterion("shopper_job <=", value, "shopperJob");
            return (Criteria) this;
        }

        public Criteria andShopperJobLike(String value) {
            addCriterion("shopper_job like", value, "shopperJob");
            return (Criteria) this;
        }

        public Criteria andShopperJobNotLike(String value) {
            addCriterion("shopper_job not like", value, "shopperJob");
            return (Criteria) this;
        }

        public Criteria andShopperJobIn(List<String> values) {
            addCriterion("shopper_job in", values, "shopperJob");
            return (Criteria) this;
        }

        public Criteria andShopperJobNotIn(List<String> values) {
            addCriterion("shopper_job not in", values, "shopperJob");
            return (Criteria) this;
        }

        public Criteria andShopperJobBetween(String value1, String value2) {
            addCriterion("shopper_job between", value1, value2, "shopperJob");
            return (Criteria) this;
        }

        public Criteria andShopperJobNotBetween(String value1, String value2) {
            addCriterion("shopper_job not between", value1, value2, "shopperJob");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}