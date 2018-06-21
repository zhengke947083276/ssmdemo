package org.com.entity;

import java.util.ArrayList;
import java.util.List;

public class TblShopsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblShopsExample() {
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

        public Criteria andShopsIdIsNull() {
            addCriterion("shops_id is null");
            return (Criteria) this;
        }

        public Criteria andShopsIdIsNotNull() {
            addCriterion("shops_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopsIdEqualTo(Integer value) {
            addCriterion("shops_id =", value, "shopsId");
            return (Criteria) this;
        }

        public Criteria andShopsIdNotEqualTo(Integer value) {
            addCriterion("shops_id <>", value, "shopsId");
            return (Criteria) this;
        }

        public Criteria andShopsIdGreaterThan(Integer value) {
            addCriterion("shops_id >", value, "shopsId");
            return (Criteria) this;
        }

        public Criteria andShopsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shops_id >=", value, "shopsId");
            return (Criteria) this;
        }

        public Criteria andShopsIdLessThan(Integer value) {
            addCriterion("shops_id <", value, "shopsId");
            return (Criteria) this;
        }

        public Criteria andShopsIdLessThanOrEqualTo(Integer value) {
            addCriterion("shops_id <=", value, "shopsId");
            return (Criteria) this;
        }

        public Criteria andShopsIdIn(List<Integer> values) {
            addCriterion("shops_id in", values, "shopsId");
            return (Criteria) this;
        }

        public Criteria andShopsIdNotIn(List<Integer> values) {
            addCriterion("shops_id not in", values, "shopsId");
            return (Criteria) this;
        }

        public Criteria andShopsIdBetween(Integer value1, Integer value2) {
            addCriterion("shops_id between", value1, value2, "shopsId");
            return (Criteria) this;
        }

        public Criteria andShopsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shops_id not between", value1, value2, "shopsId");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumIsNull() {
            addCriterion("shops_telnum is null");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumIsNotNull() {
            addCriterion("shops_telnum is not null");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumEqualTo(String value) {
            addCriterion("shops_telnum =", value, "shopsTelnum");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumNotEqualTo(String value) {
            addCriterion("shops_telnum <>", value, "shopsTelnum");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumGreaterThan(String value) {
            addCriterion("shops_telnum >", value, "shopsTelnum");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumGreaterThanOrEqualTo(String value) {
            addCriterion("shops_telnum >=", value, "shopsTelnum");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumLessThan(String value) {
            addCriterion("shops_telnum <", value, "shopsTelnum");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumLessThanOrEqualTo(String value) {
            addCriterion("shops_telnum <=", value, "shopsTelnum");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumLike(String value) {
            addCriterion("shops_telnum like", value, "shopsTelnum");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumNotLike(String value) {
            addCriterion("shops_telnum not like", value, "shopsTelnum");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumIn(List<String> values) {
            addCriterion("shops_telnum in", values, "shopsTelnum");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumNotIn(List<String> values) {
            addCriterion("shops_telnum not in", values, "shopsTelnum");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumBetween(String value1, String value2) {
            addCriterion("shops_telnum between", value1, value2, "shopsTelnum");
            return (Criteria) this;
        }

        public Criteria andShopsTelnumNotBetween(String value1, String value2) {
            addCriterion("shops_telnum not between", value1, value2, "shopsTelnum");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordIsNull() {
            addCriterion("shops_password is null");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordIsNotNull() {
            addCriterion("shops_password is not null");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordEqualTo(String value) {
            addCriterion("shops_password =", value, "shopsPassword");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordNotEqualTo(String value) {
            addCriterion("shops_password <>", value, "shopsPassword");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordGreaterThan(String value) {
            addCriterion("shops_password >", value, "shopsPassword");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("shops_password >=", value, "shopsPassword");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordLessThan(String value) {
            addCriterion("shops_password <", value, "shopsPassword");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordLessThanOrEqualTo(String value) {
            addCriterion("shops_password <=", value, "shopsPassword");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordLike(String value) {
            addCriterion("shops_password like", value, "shopsPassword");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordNotLike(String value) {
            addCriterion("shops_password not like", value, "shopsPassword");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordIn(List<String> values) {
            addCriterion("shops_password in", values, "shopsPassword");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordNotIn(List<String> values) {
            addCriterion("shops_password not in", values, "shopsPassword");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordBetween(String value1, String value2) {
            addCriterion("shops_password between", value1, value2, "shopsPassword");
            return (Criteria) this;
        }

        public Criteria andShopsPasswordNotBetween(String value1, String value2) {
            addCriterion("shops_password not between", value1, value2, "shopsPassword");
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