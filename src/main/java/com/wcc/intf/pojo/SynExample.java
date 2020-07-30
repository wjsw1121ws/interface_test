package com.wcc.intf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SynExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SynExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdSynIsNull() {
            addCriterion("ID_syn is null");
            return (Criteria) this;
        }

        public Criteria andIdSynIsNotNull() {
            addCriterion("ID_syn is not null");
            return (Criteria) this;
        }

        public Criteria andIdSynEqualTo(String value) {
            addCriterion("ID_syn =", value, "idSyn");
            return (Criteria) this;
        }

        public Criteria andIdSynNotEqualTo(String value) {
            addCriterion("ID_syn <>", value, "idSyn");
            return (Criteria) this;
        }

        public Criteria andIdSynGreaterThan(String value) {
            addCriterion("ID_syn >", value, "idSyn");
            return (Criteria) this;
        }

        public Criteria andIdSynGreaterThanOrEqualTo(String value) {
            addCriterion("ID_syn >=", value, "idSyn");
            return (Criteria) this;
        }

        public Criteria andIdSynLessThan(String value) {
            addCriterion("ID_syn <", value, "idSyn");
            return (Criteria) this;
        }

        public Criteria andIdSynLessThanOrEqualTo(String value) {
            addCriterion("ID_syn <=", value, "idSyn");
            return (Criteria) this;
        }

        public Criteria andIdSynLike(String value) {
            addCriterion("ID_syn like", value, "idSyn");
            return (Criteria) this;
        }

        public Criteria andIdSynNotLike(String value) {
            addCriterion("ID_syn not like", value, "idSyn");
            return (Criteria) this;
        }

        public Criteria andIdSynIn(List<String> values) {
            addCriterion("ID_syn in", values, "idSyn");
            return (Criteria) this;
        }

        public Criteria andIdSynNotIn(List<String> values) {
            addCriterion("ID_syn not in", values, "idSyn");
            return (Criteria) this;
        }

        public Criteria andIdSynBetween(String value1, String value2) {
            addCriterion("ID_syn between", value1, value2, "idSyn");
            return (Criteria) this;
        }

        public Criteria andIdSynNotBetween(String value1, String value2) {
            addCriterion("ID_syn not between", value1, value2, "idSyn");
            return (Criteria) this;
        }

        public Criteria andSetidIsNull() {
            addCriterion("SETID is null");
            return (Criteria) this;
        }

        public Criteria andSetidIsNotNull() {
            addCriterion("SETID is not null");
            return (Criteria) this;
        }

        public Criteria andSetidEqualTo(String value) {
            addCriterion("SETID =", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidNotEqualTo(String value) {
            addCriterion("SETID <>", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidGreaterThan(String value) {
            addCriterion("SETID >", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidGreaterThanOrEqualTo(String value) {
            addCriterion("SETID >=", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidLessThan(String value) {
            addCriterion("SETID <", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidLessThanOrEqualTo(String value) {
            addCriterion("SETID <=", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidLike(String value) {
            addCriterion("SETID like", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidNotLike(String value) {
            addCriterion("SETID not like", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidIn(List<String> values) {
            addCriterion("SETID in", values, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidNotIn(List<String> values) {
            addCriterion("SETID not in", values, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidBetween(String value1, String value2) {
            addCriterion("SETID between", value1, value2, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidNotBetween(String value1, String value2) {
            addCriterion("SETID not between", value1, value2, "setid");
            return (Criteria) this;
        }

        public Criteria andPaicOutDateIsNull() {
            addCriterion("PAIC_OUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPaicOutDateIsNotNull() {
            addCriterion("PAIC_OUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaicOutDateEqualTo(Date value) {
            addCriterion("PAIC_OUT_DATE =", value, "paicOutDate");
            return (Criteria) this;
        }

        public Criteria andPaicOutDateNotEqualTo(Date value) {
            addCriterion("PAIC_OUT_DATE <>", value, "paicOutDate");
            return (Criteria) this;
        }

        public Criteria andPaicOutDateGreaterThan(Date value) {
            addCriterion("PAIC_OUT_DATE >", value, "paicOutDate");
            return (Criteria) this;
        }

        public Criteria andPaicOutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAIC_OUT_DATE >=", value, "paicOutDate");
            return (Criteria) this;
        }

        public Criteria andPaicOutDateLessThan(Date value) {
            addCriterion("PAIC_OUT_DATE <", value, "paicOutDate");
            return (Criteria) this;
        }

        public Criteria andPaicOutDateLessThanOrEqualTo(Date value) {
            addCriterion("PAIC_OUT_DATE <=", value, "paicOutDate");
            return (Criteria) this;
        }

        public Criteria andPaicOutDateIn(List<Date> values) {
            addCriterion("PAIC_OUT_DATE in", values, "paicOutDate");
            return (Criteria) this;
        }

        public Criteria andPaicOutDateNotIn(List<Date> values) {
            addCriterion("PAIC_OUT_DATE not in", values, "paicOutDate");
            return (Criteria) this;
        }

        public Criteria andPaicOutDateBetween(Date value1, Date value2) {
            addCriterion("PAIC_OUT_DATE between", value1, value2, "paicOutDate");
            return (Criteria) this;
        }

        public Criteria andPaicOutDateNotBetween(Date value1, Date value2) {
            addCriterion("PAIC_OUT_DATE not between", value1, value2, "paicOutDate");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagIsNull() {
            addCriterion("PAIC_OUT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagIsNotNull() {
            addCriterion("PAIC_OUT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagEqualTo(String value) {
            addCriterion("PAIC_OUT_FLAG =", value, "paicOutFlag");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagNotEqualTo(String value) {
            addCriterion("PAIC_OUT_FLAG <>", value, "paicOutFlag");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagGreaterThan(String value) {
            addCriterion("PAIC_OUT_FLAG >", value, "paicOutFlag");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PAIC_OUT_FLAG >=", value, "paicOutFlag");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagLessThan(String value) {
            addCriterion("PAIC_OUT_FLAG <", value, "paicOutFlag");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagLessThanOrEqualTo(String value) {
            addCriterion("PAIC_OUT_FLAG <=", value, "paicOutFlag");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagLike(String value) {
            addCriterion("PAIC_OUT_FLAG like", value, "paicOutFlag");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagNotLike(String value) {
            addCriterion("PAIC_OUT_FLAG not like", value, "paicOutFlag");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagIn(List<String> values) {
            addCriterion("PAIC_OUT_FLAG in", values, "paicOutFlag");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagNotIn(List<String> values) {
            addCriterion("PAIC_OUT_FLAG not in", values, "paicOutFlag");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagBetween(String value1, String value2) {
            addCriterion("PAIC_OUT_FLAG between", value1, value2, "paicOutFlag");
            return (Criteria) this;
        }

        public Criteria andPaicOutFlagNotBetween(String value1, String value2) {
            addCriterion("PAIC_OUT_FLAG not between", value1, value2, "paicOutFlag");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DEPTID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(String value) {
            addCriterion("DEPTID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(String value) {
            addCriterion("DEPTID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(String value) {
            addCriterion("DEPTID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(String value) {
            addCriterion("DEPTID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(String value) {
            addCriterion("DEPTID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLike(String value) {
            addCriterion("DEPTID like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotLike(String value) {
            addCriterion("DEPTID not like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<String> values) {
            addCriterion("DEPTID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<String> values) {
            addCriterion("DEPTID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(String value1, String value2) {
            addCriterion("DEPTID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(String value1, String value2) {
            addCriterion("DEPTID not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrIsNull() {
            addCriterion("PAIC_SETID_DESCR is null");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrIsNotNull() {
            addCriterion("PAIC_SETID_DESCR is not null");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrEqualTo(String value) {
            addCriterion("PAIC_SETID_DESCR =", value, "paicSetidDescr");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrNotEqualTo(String value) {
            addCriterion("PAIC_SETID_DESCR <>", value, "paicSetidDescr");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrGreaterThan(String value) {
            addCriterion("PAIC_SETID_DESCR >", value, "paicSetidDescr");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrGreaterThanOrEqualTo(String value) {
            addCriterion("PAIC_SETID_DESCR >=", value, "paicSetidDescr");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrLessThan(String value) {
            addCriterion("PAIC_SETID_DESCR <", value, "paicSetidDescr");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrLessThanOrEqualTo(String value) {
            addCriterion("PAIC_SETID_DESCR <=", value, "paicSetidDescr");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrLike(String value) {
            addCriterion("PAIC_SETID_DESCR like", value, "paicSetidDescr");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrNotLike(String value) {
            addCriterion("PAIC_SETID_DESCR not like", value, "paicSetidDescr");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrIn(List<String> values) {
            addCriterion("PAIC_SETID_DESCR in", values, "paicSetidDescr");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrNotIn(List<String> values) {
            addCriterion("PAIC_SETID_DESCR not in", values, "paicSetidDescr");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrBetween(String value1, String value2) {
            addCriterion("PAIC_SETID_DESCR between", value1, value2, "paicSetidDescr");
            return (Criteria) this;
        }

        public Criteria andPaicSetidDescrNotBetween(String value1, String value2) {
            addCriterion("PAIC_SETID_DESCR not between", value1, value2, "paicSetidDescr");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrIsNull() {
            addCriterion("DEPTID_DESCR is null");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrIsNotNull() {
            addCriterion("DEPTID_DESCR is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrEqualTo(String value) {
            addCriterion("DEPTID_DESCR =", value, "deptidDescr");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrNotEqualTo(String value) {
            addCriterion("DEPTID_DESCR <>", value, "deptidDescr");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrGreaterThan(String value) {
            addCriterion("DEPTID_DESCR >", value, "deptidDescr");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTID_DESCR >=", value, "deptidDescr");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrLessThan(String value) {
            addCriterion("DEPTID_DESCR <", value, "deptidDescr");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrLessThanOrEqualTo(String value) {
            addCriterion("DEPTID_DESCR <=", value, "deptidDescr");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrLike(String value) {
            addCriterion("DEPTID_DESCR like", value, "deptidDescr");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrNotLike(String value) {
            addCriterion("DEPTID_DESCR not like", value, "deptidDescr");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrIn(List<String> values) {
            addCriterion("DEPTID_DESCR in", values, "deptidDescr");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrNotIn(List<String> values) {
            addCriterion("DEPTID_DESCR not in", values, "deptidDescr");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrBetween(String value1, String value2) {
            addCriterion("DEPTID_DESCR between", value1, value2, "deptidDescr");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrNotBetween(String value1, String value2) {
            addCriterion("DEPTID_DESCR not between", value1, value2, "deptidDescr");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortIsNull() {
            addCriterion("DEPTID_DESCR_SHORT is null");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortIsNotNull() {
            addCriterion("DEPTID_DESCR_SHORT is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortEqualTo(String value) {
            addCriterion("DEPTID_DESCR_SHORT =", value, "deptidDescrShort");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortNotEqualTo(String value) {
            addCriterion("DEPTID_DESCR_SHORT <>", value, "deptidDescrShort");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortGreaterThan(String value) {
            addCriterion("DEPTID_DESCR_SHORT >", value, "deptidDescrShort");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTID_DESCR_SHORT >=", value, "deptidDescrShort");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortLessThan(String value) {
            addCriterion("DEPTID_DESCR_SHORT <", value, "deptidDescrShort");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortLessThanOrEqualTo(String value) {
            addCriterion("DEPTID_DESCR_SHORT <=", value, "deptidDescrShort");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortLike(String value) {
            addCriterion("DEPTID_DESCR_SHORT like", value, "deptidDescrShort");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortNotLike(String value) {
            addCriterion("DEPTID_DESCR_SHORT not like", value, "deptidDescrShort");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortIn(List<String> values) {
            addCriterion("DEPTID_DESCR_SHORT in", values, "deptidDescrShort");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortNotIn(List<String> values) {
            addCriterion("DEPTID_DESCR_SHORT not in", values, "deptidDescrShort");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortBetween(String value1, String value2) {
            addCriterion("DEPTID_DESCR_SHORT between", value1, value2, "deptidDescrShort");
            return (Criteria) this;
        }

        public Criteria andDeptidDescrShortNotBetween(String value1, String value2) {
            addCriterion("DEPTID_DESCR_SHORT not between", value1, value2, "deptidDescrShort");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoIsNull() {
            addCriterion("PAIC_DEPTTP_NO is null");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoIsNotNull() {
            addCriterion("PAIC_DEPTTP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoEqualTo(String value) {
            addCriterion("PAIC_DEPTTP_NO =", value, "paicDepttpNo");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoNotEqualTo(String value) {
            addCriterion("PAIC_DEPTTP_NO <>", value, "paicDepttpNo");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoGreaterThan(String value) {
            addCriterion("PAIC_DEPTTP_NO >", value, "paicDepttpNo");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAIC_DEPTTP_NO >=", value, "paicDepttpNo");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoLessThan(String value) {
            addCriterion("PAIC_DEPTTP_NO <", value, "paicDepttpNo");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoLessThanOrEqualTo(String value) {
            addCriterion("PAIC_DEPTTP_NO <=", value, "paicDepttpNo");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoLike(String value) {
            addCriterion("PAIC_DEPTTP_NO like", value, "paicDepttpNo");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoNotLike(String value) {
            addCriterion("PAIC_DEPTTP_NO not like", value, "paicDepttpNo");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoIn(List<String> values) {
            addCriterion("PAIC_DEPTTP_NO in", values, "paicDepttpNo");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoNotIn(List<String> values) {
            addCriterion("PAIC_DEPTTP_NO not in", values, "paicDepttpNo");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoBetween(String value1, String value2) {
            addCriterion("PAIC_DEPTTP_NO between", value1, value2, "paicDepttpNo");
            return (Criteria) this;
        }

        public Criteria andPaicDepttpNoNotBetween(String value1, String value2) {
            addCriterion("PAIC_DEPTTP_NO not between", value1, value2, "paicDepttpNo");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescIsNull() {
            addCriterion("PAIC_DEPTNO_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescIsNotNull() {
            addCriterion("PAIC_DEPTNO_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescEqualTo(String value) {
            addCriterion("PAIC_DEPTNO_DESC =", value, "paicDeptnoDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescNotEqualTo(String value) {
            addCriterion("PAIC_DEPTNO_DESC <>", value, "paicDeptnoDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescGreaterThan(String value) {
            addCriterion("PAIC_DEPTNO_DESC >", value, "paicDeptnoDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescGreaterThanOrEqualTo(String value) {
            addCriterion("PAIC_DEPTNO_DESC >=", value, "paicDeptnoDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescLessThan(String value) {
            addCriterion("PAIC_DEPTNO_DESC <", value, "paicDeptnoDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescLessThanOrEqualTo(String value) {
            addCriterion("PAIC_DEPTNO_DESC <=", value, "paicDeptnoDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescLike(String value) {
            addCriterion("PAIC_DEPTNO_DESC like", value, "paicDeptnoDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescNotLike(String value) {
            addCriterion("PAIC_DEPTNO_DESC not like", value, "paicDeptnoDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescIn(List<String> values) {
            addCriterion("PAIC_DEPTNO_DESC in", values, "paicDeptnoDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescNotIn(List<String> values) {
            addCriterion("PAIC_DEPTNO_DESC not in", values, "paicDeptnoDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescBetween(String value1, String value2) {
            addCriterion("PAIC_DEPTNO_DESC between", value1, value2, "paicDeptnoDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptnoDescNotBetween(String value1, String value2) {
            addCriterion("PAIC_DEPTNO_DESC not between", value1, value2, "paicDeptnoDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoIsNull() {
            addCriterion("PAIC_DEPTLEV_NO is null");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoIsNotNull() {
            addCriterion("PAIC_DEPTLEV_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoEqualTo(String value) {
            addCriterion("PAIC_DEPTLEV_NO =", value, "paicDeptlevNo");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoNotEqualTo(String value) {
            addCriterion("PAIC_DEPTLEV_NO <>", value, "paicDeptlevNo");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoGreaterThan(String value) {
            addCriterion("PAIC_DEPTLEV_NO >", value, "paicDeptlevNo");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAIC_DEPTLEV_NO >=", value, "paicDeptlevNo");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoLessThan(String value) {
            addCriterion("PAIC_DEPTLEV_NO <", value, "paicDeptlevNo");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoLessThanOrEqualTo(String value) {
            addCriterion("PAIC_DEPTLEV_NO <=", value, "paicDeptlevNo");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoLike(String value) {
            addCriterion("PAIC_DEPTLEV_NO like", value, "paicDeptlevNo");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoNotLike(String value) {
            addCriterion("PAIC_DEPTLEV_NO not like", value, "paicDeptlevNo");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoIn(List<String> values) {
            addCriterion("PAIC_DEPTLEV_NO in", values, "paicDeptlevNo");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoNotIn(List<String> values) {
            addCriterion("PAIC_DEPTLEV_NO not in", values, "paicDeptlevNo");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoBetween(String value1, String value2) {
            addCriterion("PAIC_DEPTLEV_NO between", value1, value2, "paicDeptlevNo");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevNoNotBetween(String value1, String value2) {
            addCriterion("PAIC_DEPTLEV_NO not between", value1, value2, "paicDeptlevNo");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescIsNull() {
            addCriterion("PAIC_DEPTLEV_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescIsNotNull() {
            addCriterion("PAIC_DEPTLEV_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescEqualTo(String value) {
            addCriterion("PAIC_DEPTLEV_DESC =", value, "paicDeptlevDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescNotEqualTo(String value) {
            addCriterion("PAIC_DEPTLEV_DESC <>", value, "paicDeptlevDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescGreaterThan(String value) {
            addCriterion("PAIC_DEPTLEV_DESC >", value, "paicDeptlevDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescGreaterThanOrEqualTo(String value) {
            addCriterion("PAIC_DEPTLEV_DESC >=", value, "paicDeptlevDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescLessThan(String value) {
            addCriterion("PAIC_DEPTLEV_DESC <", value, "paicDeptlevDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescLessThanOrEqualTo(String value) {
            addCriterion("PAIC_DEPTLEV_DESC <=", value, "paicDeptlevDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescLike(String value) {
            addCriterion("PAIC_DEPTLEV_DESC like", value, "paicDeptlevDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescNotLike(String value) {
            addCriterion("PAIC_DEPTLEV_DESC not like", value, "paicDeptlevDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescIn(List<String> values) {
            addCriterion("PAIC_DEPTLEV_DESC in", values, "paicDeptlevDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescNotIn(List<String> values) {
            addCriterion("PAIC_DEPTLEV_DESC not in", values, "paicDeptlevDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescBetween(String value1, String value2) {
            addCriterion("PAIC_DEPTLEV_DESC between", value1, value2, "paicDeptlevDesc");
            return (Criteria) this;
        }

        public Criteria andPaicDeptlevDescNotBetween(String value1, String value2) {
            addCriterion("PAIC_DEPTLEV_DESC not between", value1, value2, "paicDeptlevDesc");
            return (Criteria) this;
        }

        public Criteria andLocationDescrIsNull() {
            addCriterion("LOCATION_DESCR is null");
            return (Criteria) this;
        }

        public Criteria andLocationDescrIsNotNull() {
            addCriterion("LOCATION_DESCR is not null");
            return (Criteria) this;
        }

        public Criteria andLocationDescrEqualTo(String value) {
            addCriterion("LOCATION_DESCR =", value, "locationDescr");
            return (Criteria) this;
        }

        public Criteria andLocationDescrNotEqualTo(String value) {
            addCriterion("LOCATION_DESCR <>", value, "locationDescr");
            return (Criteria) this;
        }

        public Criteria andLocationDescrGreaterThan(String value) {
            addCriterion("LOCATION_DESCR >", value, "locationDescr");
            return (Criteria) this;
        }

        public Criteria andLocationDescrGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION_DESCR >=", value, "locationDescr");
            return (Criteria) this;
        }

        public Criteria andLocationDescrLessThan(String value) {
            addCriterion("LOCATION_DESCR <", value, "locationDescr");
            return (Criteria) this;
        }

        public Criteria andLocationDescrLessThanOrEqualTo(String value) {
            addCriterion("LOCATION_DESCR <=", value, "locationDescr");
            return (Criteria) this;
        }

        public Criteria andLocationDescrLike(String value) {
            addCriterion("LOCATION_DESCR like", value, "locationDescr");
            return (Criteria) this;
        }

        public Criteria andLocationDescrNotLike(String value) {
            addCriterion("LOCATION_DESCR not like", value, "locationDescr");
            return (Criteria) this;
        }

        public Criteria andLocationDescrIn(List<String> values) {
            addCriterion("LOCATION_DESCR in", values, "locationDescr");
            return (Criteria) this;
        }

        public Criteria andLocationDescrNotIn(List<String> values) {
            addCriterion("LOCATION_DESCR not in", values, "locationDescr");
            return (Criteria) this;
        }

        public Criteria andLocationDescrBetween(String value1, String value2) {
            addCriterion("LOCATION_DESCR between", value1, value2, "locationDescr");
            return (Criteria) this;
        }

        public Criteria andLocationDescrNotBetween(String value1, String value2) {
            addCriterion("LOCATION_DESCR not between", value1, value2, "locationDescr");
            return (Criteria) this;
        }

        public Criteria andPostalIsNull() {
            addCriterion("POSTAL is null");
            return (Criteria) this;
        }

        public Criteria andPostalIsNotNull() {
            addCriterion("POSTAL is not null");
            return (Criteria) this;
        }

        public Criteria andPostalEqualTo(String value) {
            addCriterion("POSTAL =", value, "postal");
            return (Criteria) this;
        }

        public Criteria andPostalNotEqualTo(String value) {
            addCriterion("POSTAL <>", value, "postal");
            return (Criteria) this;
        }

        public Criteria andPostalGreaterThan(String value) {
            addCriterion("POSTAL >", value, "postal");
            return (Criteria) this;
        }

        public Criteria andPostalGreaterThanOrEqualTo(String value) {
            addCriterion("POSTAL >=", value, "postal");
            return (Criteria) this;
        }

        public Criteria andPostalLessThan(String value) {
            addCriterion("POSTAL <", value, "postal");
            return (Criteria) this;
        }

        public Criteria andPostalLessThanOrEqualTo(String value) {
            addCriterion("POSTAL <=", value, "postal");
            return (Criteria) this;
        }

        public Criteria andPostalLike(String value) {
            addCriterion("POSTAL like", value, "postal");
            return (Criteria) this;
        }

        public Criteria andPostalNotLike(String value) {
            addCriterion("POSTAL not like", value, "postal");
            return (Criteria) this;
        }

        public Criteria andPostalIn(List<String> values) {
            addCriterion("POSTAL in", values, "postal");
            return (Criteria) this;
        }

        public Criteria andPostalNotIn(List<String> values) {
            addCriterion("POSTAL not in", values, "postal");
            return (Criteria) this;
        }

        public Criteria andPostalBetween(String value1, String value2) {
            addCriterion("POSTAL between", value1, value2, "postal");
            return (Criteria) this;
        }

        public Criteria andPostalNotBetween(String value1, String value2) {
            addCriterion("POSTAL not between", value1, value2, "postal");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtIsNull() {
            addCriterion("PAIC_DEPT_STARTDT is null");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtIsNotNull() {
            addCriterion("PAIC_DEPT_STARTDT is not null");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtEqualTo(String value) {
            addCriterion("PAIC_DEPT_STARTDT =", value, "paicDeptStartdt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtNotEqualTo(String value) {
            addCriterion("PAIC_DEPT_STARTDT <>", value, "paicDeptStartdt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtGreaterThan(String value) {
            addCriterion("PAIC_DEPT_STARTDT >", value, "paicDeptStartdt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtGreaterThanOrEqualTo(String value) {
            addCriterion("PAIC_DEPT_STARTDT >=", value, "paicDeptStartdt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtLessThan(String value) {
            addCriterion("PAIC_DEPT_STARTDT <", value, "paicDeptStartdt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtLessThanOrEqualTo(String value) {
            addCriterion("PAIC_DEPT_STARTDT <=", value, "paicDeptStartdt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtLike(String value) {
            addCriterion("PAIC_DEPT_STARTDT like", value, "paicDeptStartdt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtNotLike(String value) {
            addCriterion("PAIC_DEPT_STARTDT not like", value, "paicDeptStartdt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtIn(List<String> values) {
            addCriterion("PAIC_DEPT_STARTDT in", values, "paicDeptStartdt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtNotIn(List<String> values) {
            addCriterion("PAIC_DEPT_STARTDT not in", values, "paicDeptStartdt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtBetween(String value1, String value2) {
            addCriterion("PAIC_DEPT_STARTDT between", value1, value2, "paicDeptStartdt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptStartdtNotBetween(String value1, String value2) {
            addCriterion("PAIC_DEPT_STARTDT not between", value1, value2, "paicDeptStartdt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtIsNull() {
            addCriterion("PAIC_DEPT_ENDDT is null");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtIsNotNull() {
            addCriterion("PAIC_DEPT_ENDDT is not null");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtEqualTo(String value) {
            addCriterion("PAIC_DEPT_ENDDT =", value, "paicDeptEnddt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtNotEqualTo(String value) {
            addCriterion("PAIC_DEPT_ENDDT <>", value, "paicDeptEnddt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtGreaterThan(String value) {
            addCriterion("PAIC_DEPT_ENDDT >", value, "paicDeptEnddt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtGreaterThanOrEqualTo(String value) {
            addCriterion("PAIC_DEPT_ENDDT >=", value, "paicDeptEnddt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtLessThan(String value) {
            addCriterion("PAIC_DEPT_ENDDT <", value, "paicDeptEnddt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtLessThanOrEqualTo(String value) {
            addCriterion("PAIC_DEPT_ENDDT <=", value, "paicDeptEnddt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtLike(String value) {
            addCriterion("PAIC_DEPT_ENDDT like", value, "paicDeptEnddt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtNotLike(String value) {
            addCriterion("PAIC_DEPT_ENDDT not like", value, "paicDeptEnddt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtIn(List<String> values) {
            addCriterion("PAIC_DEPT_ENDDT in", values, "paicDeptEnddt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtNotIn(List<String> values) {
            addCriterion("PAIC_DEPT_ENDDT not in", values, "paicDeptEnddt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtBetween(String value1, String value2) {
            addCriterion("PAIC_DEPT_ENDDT between", value1, value2, "paicDeptEnddt");
            return (Criteria) this;
        }

        public Criteria andPaicDeptEnddtNotBetween(String value1, String value2) {
            addCriterion("PAIC_DEPT_ENDDT not between", value1, value2, "paicDeptEnddt");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmIsNull() {
            addCriterion("PAIC_ROWADD_DTTM is null");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmIsNotNull() {
            addCriterion("PAIC_ROWADD_DTTM is not null");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmEqualTo(String value) {
            addCriterion("PAIC_ROWADD_DTTM =", value, "paicRowaddDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmNotEqualTo(String value) {
            addCriterion("PAIC_ROWADD_DTTM <>", value, "paicRowaddDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmGreaterThan(String value) {
            addCriterion("PAIC_ROWADD_DTTM >", value, "paicRowaddDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmGreaterThanOrEqualTo(String value) {
            addCriterion("PAIC_ROWADD_DTTM >=", value, "paicRowaddDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmLessThan(String value) {
            addCriterion("PAIC_ROWADD_DTTM <", value, "paicRowaddDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmLessThanOrEqualTo(String value) {
            addCriterion("PAIC_ROWADD_DTTM <=", value, "paicRowaddDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmLike(String value) {
            addCriterion("PAIC_ROWADD_DTTM like", value, "paicRowaddDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmNotLike(String value) {
            addCriterion("PAIC_ROWADD_DTTM not like", value, "paicRowaddDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmIn(List<String> values) {
            addCriterion("PAIC_ROWADD_DTTM in", values, "paicRowaddDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmNotIn(List<String> values) {
            addCriterion("PAIC_ROWADD_DTTM not in", values, "paicRowaddDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmBetween(String value1, String value2) {
            addCriterion("PAIC_ROWADD_DTTM between", value1, value2, "paicRowaddDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowaddDttmNotBetween(String value1, String value2) {
            addCriterion("PAIC_ROWADD_DTTM not between", value1, value2, "paicRowaddDttm");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridIsNull() {
            addCriterion("HRS_ROW_ADD_OPRID is null");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridIsNotNull() {
            addCriterion("HRS_ROW_ADD_OPRID is not null");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridEqualTo(String value) {
            addCriterion("HRS_ROW_ADD_OPRID =", value, "hrsRowAddOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridNotEqualTo(String value) {
            addCriterion("HRS_ROW_ADD_OPRID <>", value, "hrsRowAddOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridGreaterThan(String value) {
            addCriterion("HRS_ROW_ADD_OPRID >", value, "hrsRowAddOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridGreaterThanOrEqualTo(String value) {
            addCriterion("HRS_ROW_ADD_OPRID >=", value, "hrsRowAddOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridLessThan(String value) {
            addCriterion("HRS_ROW_ADD_OPRID <", value, "hrsRowAddOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridLessThanOrEqualTo(String value) {
            addCriterion("HRS_ROW_ADD_OPRID <=", value, "hrsRowAddOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridLike(String value) {
            addCriterion("HRS_ROW_ADD_OPRID like", value, "hrsRowAddOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridNotLike(String value) {
            addCriterion("HRS_ROW_ADD_OPRID not like", value, "hrsRowAddOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridIn(List<String> values) {
            addCriterion("HRS_ROW_ADD_OPRID in", values, "hrsRowAddOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridNotIn(List<String> values) {
            addCriterion("HRS_ROW_ADD_OPRID not in", values, "hrsRowAddOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridBetween(String value1, String value2) {
            addCriterion("HRS_ROW_ADD_OPRID between", value1, value2, "hrsRowAddOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowAddOpridNotBetween(String value1, String value2) {
            addCriterion("HRS_ROW_ADD_OPRID not between", value1, value2, "hrsRowAddOprid");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmIsNull() {
            addCriterion("PAIC_ROWUPD_DTTM is null");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmIsNotNull() {
            addCriterion("PAIC_ROWUPD_DTTM is not null");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmEqualTo(String value) {
            addCriterion("PAIC_ROWUPD_DTTM =", value, "paicRowupdDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmNotEqualTo(String value) {
            addCriterion("PAIC_ROWUPD_DTTM <>", value, "paicRowupdDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmGreaterThan(String value) {
            addCriterion("PAIC_ROWUPD_DTTM >", value, "paicRowupdDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmGreaterThanOrEqualTo(String value) {
            addCriterion("PAIC_ROWUPD_DTTM >=", value, "paicRowupdDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmLessThan(String value) {
            addCriterion("PAIC_ROWUPD_DTTM <", value, "paicRowupdDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmLessThanOrEqualTo(String value) {
            addCriterion("PAIC_ROWUPD_DTTM <=", value, "paicRowupdDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmLike(String value) {
            addCriterion("PAIC_ROWUPD_DTTM like", value, "paicRowupdDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmNotLike(String value) {
            addCriterion("PAIC_ROWUPD_DTTM not like", value, "paicRowupdDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmIn(List<String> values) {
            addCriterion("PAIC_ROWUPD_DTTM in", values, "paicRowupdDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmNotIn(List<String> values) {
            addCriterion("PAIC_ROWUPD_DTTM not in", values, "paicRowupdDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmBetween(String value1, String value2) {
            addCriterion("PAIC_ROWUPD_DTTM between", value1, value2, "paicRowupdDttm");
            return (Criteria) this;
        }

        public Criteria andPaicRowupdDttmNotBetween(String value1, String value2) {
            addCriterion("PAIC_ROWUPD_DTTM not between", value1, value2, "paicRowupdDttm");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridIsNull() {
            addCriterion("HRS_ROW_UPD_OPRID is null");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridIsNotNull() {
            addCriterion("HRS_ROW_UPD_OPRID is not null");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridEqualTo(String value) {
            addCriterion("HRS_ROW_UPD_OPRID =", value, "hrsRowUpdOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridNotEqualTo(String value) {
            addCriterion("HRS_ROW_UPD_OPRID <>", value, "hrsRowUpdOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridGreaterThan(String value) {
            addCriterion("HRS_ROW_UPD_OPRID >", value, "hrsRowUpdOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridGreaterThanOrEqualTo(String value) {
            addCriterion("HRS_ROW_UPD_OPRID >=", value, "hrsRowUpdOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridLessThan(String value) {
            addCriterion("HRS_ROW_UPD_OPRID <", value, "hrsRowUpdOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridLessThanOrEqualTo(String value) {
            addCriterion("HRS_ROW_UPD_OPRID <=", value, "hrsRowUpdOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridLike(String value) {
            addCriterion("HRS_ROW_UPD_OPRID like", value, "hrsRowUpdOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridNotLike(String value) {
            addCriterion("HRS_ROW_UPD_OPRID not like", value, "hrsRowUpdOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridIn(List<String> values) {
            addCriterion("HRS_ROW_UPD_OPRID in", values, "hrsRowUpdOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridNotIn(List<String> values) {
            addCriterion("HRS_ROW_UPD_OPRID not in", values, "hrsRowUpdOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridBetween(String value1, String value2) {
            addCriterion("HRS_ROW_UPD_OPRID between", value1, value2, "hrsRowUpdOprid");
            return (Criteria) this;
        }

        public Criteria andHrsRowUpdOpridNotBetween(String value1, String value2) {
            addCriterion("HRS_ROW_UPD_OPRID not between", value1, value2, "hrsRowUpdOprid");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameIsNull() {
            addCriterion("PARENT_NODE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameIsNotNull() {
            addCriterion("PARENT_NODE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameEqualTo(String value) {
            addCriterion("PARENT_NODE_NAME =", value, "parentNodeName");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameNotEqualTo(String value) {
            addCriterion("PARENT_NODE_NAME <>", value, "parentNodeName");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameGreaterThan(String value) {
            addCriterion("PARENT_NODE_NAME >", value, "parentNodeName");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_NODE_NAME >=", value, "parentNodeName");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameLessThan(String value) {
            addCriterion("PARENT_NODE_NAME <", value, "parentNodeName");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameLessThanOrEqualTo(String value) {
            addCriterion("PARENT_NODE_NAME <=", value, "parentNodeName");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameLike(String value) {
            addCriterion("PARENT_NODE_NAME like", value, "parentNodeName");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameNotLike(String value) {
            addCriterion("PARENT_NODE_NAME not like", value, "parentNodeName");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameIn(List<String> values) {
            addCriterion("PARENT_NODE_NAME in", values, "parentNodeName");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameNotIn(List<String> values) {
            addCriterion("PARENT_NODE_NAME not in", values, "parentNodeName");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameBetween(String value1, String value2) {
            addCriterion("PARENT_NODE_NAME between", value1, value2, "parentNodeName");
            return (Criteria) this;
        }

        public Criteria andParentNodeNameNotBetween(String value1, String value2) {
            addCriterion("PARENT_NODE_NAME not between", value1, value2, "parentNodeName");
            return (Criteria) this;
        }

        public Criteria andParentNodeNumIsNull() {
            addCriterion("PARENT_NODE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andParentNodeNumIsNotNull() {
            addCriterion("PARENT_NODE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andParentNodeNumEqualTo(Integer value) {
            addCriterion("PARENT_NODE_NUM =", value, "parentNodeNum");
            return (Criteria) this;
        }

        public Criteria andParentNodeNumNotEqualTo(Integer value) {
            addCriterion("PARENT_NODE_NUM <>", value, "parentNodeNum");
            return (Criteria) this;
        }

        public Criteria andParentNodeNumGreaterThan(Integer value) {
            addCriterion("PARENT_NODE_NUM >", value, "parentNodeNum");
            return (Criteria) this;
        }

        public Criteria andParentNodeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_NODE_NUM >=", value, "parentNodeNum");
            return (Criteria) this;
        }

        public Criteria andParentNodeNumLessThan(Integer value) {
            addCriterion("PARENT_NODE_NUM <", value, "parentNodeNum");
            return (Criteria) this;
        }

        public Criteria andParentNodeNumLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_NODE_NUM <=", value, "parentNodeNum");
            return (Criteria) this;
        }

        public Criteria andParentNodeNumIn(List<Integer> values) {
            addCriterion("PARENT_NODE_NUM in", values, "parentNodeNum");
            return (Criteria) this;
        }

        public Criteria andParentNodeNumNotIn(List<Integer> values) {
            addCriterion("PARENT_NODE_NUM not in", values, "parentNodeNum");
            return (Criteria) this;
        }

        public Criteria andParentNodeNumBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_NODE_NUM between", value1, value2, "parentNodeNum");
            return (Criteria) this;
        }

        public Criteria andParentNodeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_NODE_NUM not between", value1, value2, "parentNodeNum");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumIsNull() {
            addCriterion("TREE_NODE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumIsNotNull() {
            addCriterion("TREE_NODE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumEqualTo(Integer value) {
            addCriterion("TREE_NODE_NUM =", value, "treeNodeNum");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumNotEqualTo(Integer value) {
            addCriterion("TREE_NODE_NUM <>", value, "treeNodeNum");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumGreaterThan(Integer value) {
            addCriterion("TREE_NODE_NUM >", value, "treeNodeNum");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("TREE_NODE_NUM >=", value, "treeNodeNum");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumLessThan(Integer value) {
            addCriterion("TREE_NODE_NUM <", value, "treeNodeNum");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumLessThanOrEqualTo(Integer value) {
            addCriterion("TREE_NODE_NUM <=", value, "treeNodeNum");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumIn(List<Integer> values) {
            addCriterion("TREE_NODE_NUM in", values, "treeNodeNum");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumNotIn(List<Integer> values) {
            addCriterion("TREE_NODE_NUM not in", values, "treeNodeNum");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumBetween(Integer value1, Integer value2) {
            addCriterion("TREE_NODE_NUM between", value1, value2, "treeNodeNum");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("TREE_NODE_NUM not between", value1, value2, "treeNodeNum");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumEndIsNull() {
            addCriterion("TREE_NODE_NUM_END is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumEndIsNotNull() {
            addCriterion("TREE_NODE_NUM_END is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumEndEqualTo(Integer value) {
            addCriterion("TREE_NODE_NUM_END =", value, "treeNodeNumEnd");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumEndNotEqualTo(Integer value) {
            addCriterion("TREE_NODE_NUM_END <>", value, "treeNodeNumEnd");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumEndGreaterThan(Integer value) {
            addCriterion("TREE_NODE_NUM_END >", value, "treeNodeNumEnd");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("TREE_NODE_NUM_END >=", value, "treeNodeNumEnd");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumEndLessThan(Integer value) {
            addCriterion("TREE_NODE_NUM_END <", value, "treeNodeNumEnd");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumEndLessThanOrEqualTo(Integer value) {
            addCriterion("TREE_NODE_NUM_END <=", value, "treeNodeNumEnd");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumEndIn(List<Integer> values) {
            addCriterion("TREE_NODE_NUM_END in", values, "treeNodeNumEnd");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumEndNotIn(List<Integer> values) {
            addCriterion("TREE_NODE_NUM_END not in", values, "treeNodeNumEnd");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumEndBetween(Integer value1, Integer value2) {
            addCriterion("TREE_NODE_NUM_END between", value1, value2, "treeNodeNumEnd");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNumEndNotBetween(Integer value1, Integer value2) {
            addCriterion("TREE_NODE_NUM_END not between", value1, value2, "treeNodeNumEnd");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNumIsNull() {
            addCriterion("TREE_LEVEL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNumIsNotNull() {
            addCriterion("TREE_LEVEL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNumEqualTo(Integer value) {
            addCriterion("TREE_LEVEL_NUM =", value, "treeLevelNum");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNumNotEqualTo(Integer value) {
            addCriterion("TREE_LEVEL_NUM <>", value, "treeLevelNum");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNumGreaterThan(Integer value) {
            addCriterion("TREE_LEVEL_NUM >", value, "treeLevelNum");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("TREE_LEVEL_NUM >=", value, "treeLevelNum");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNumLessThan(Integer value) {
            addCriterion("TREE_LEVEL_NUM <", value, "treeLevelNum");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNumLessThanOrEqualTo(Integer value) {
            addCriterion("TREE_LEVEL_NUM <=", value, "treeLevelNum");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNumIn(List<Integer> values) {
            addCriterion("TREE_LEVEL_NUM in", values, "treeLevelNum");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNumNotIn(List<Integer> values) {
            addCriterion("TREE_LEVEL_NUM not in", values, "treeLevelNum");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNumBetween(Integer value1, Integer value2) {
            addCriterion("TREE_LEVEL_NUM between", value1, value2, "treeLevelNum");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNumNotBetween(Integer value1, Integer value2) {
            addCriterion("TREE_LEVEL_NUM not between", value1, value2, "treeLevelNum");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgIsNull() {
            addCriterion("PAIC_TREEND_FLG is null");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgIsNotNull() {
            addCriterion("PAIC_TREEND_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgEqualTo(String value) {
            addCriterion("PAIC_TREEND_FLG =", value, "paicTreendFlg");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgNotEqualTo(String value) {
            addCriterion("PAIC_TREEND_FLG <>", value, "paicTreendFlg");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgGreaterThan(String value) {
            addCriterion("PAIC_TREEND_FLG >", value, "paicTreendFlg");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgGreaterThanOrEqualTo(String value) {
            addCriterion("PAIC_TREEND_FLG >=", value, "paicTreendFlg");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgLessThan(String value) {
            addCriterion("PAIC_TREEND_FLG <", value, "paicTreendFlg");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgLessThanOrEqualTo(String value) {
            addCriterion("PAIC_TREEND_FLG <=", value, "paicTreendFlg");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgLike(String value) {
            addCriterion("PAIC_TREEND_FLG like", value, "paicTreendFlg");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgNotLike(String value) {
            addCriterion("PAIC_TREEND_FLG not like", value, "paicTreendFlg");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgIn(List<String> values) {
            addCriterion("PAIC_TREEND_FLG in", values, "paicTreendFlg");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgNotIn(List<String> values) {
            addCriterion("PAIC_TREEND_FLG not in", values, "paicTreendFlg");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgBetween(String value1, String value2) {
            addCriterion("PAIC_TREEND_FLG between", value1, value2, "paicTreendFlg");
            return (Criteria) this;
        }

        public Criteria andPaicTreendFlgNotBetween(String value1, String value2) {
            addCriterion("PAIC_TREEND_FLG not between", value1, value2, "paicTreendFlg");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidIsNull() {
            addCriterion("PAIC_UNIQUE_DEPTID is null");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidIsNotNull() {
            addCriterion("PAIC_UNIQUE_DEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidEqualTo(String value) {
            addCriterion("PAIC_UNIQUE_DEPTID =", value, "paicUniqueDeptid");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidNotEqualTo(String value) {
            addCriterion("PAIC_UNIQUE_DEPTID <>", value, "paicUniqueDeptid");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidGreaterThan(String value) {
            addCriterion("PAIC_UNIQUE_DEPTID >", value, "paicUniqueDeptid");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("PAIC_UNIQUE_DEPTID >=", value, "paicUniqueDeptid");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidLessThan(String value) {
            addCriterion("PAIC_UNIQUE_DEPTID <", value, "paicUniqueDeptid");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidLessThanOrEqualTo(String value) {
            addCriterion("PAIC_UNIQUE_DEPTID <=", value, "paicUniqueDeptid");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidLike(String value) {
            addCriterion("PAIC_UNIQUE_DEPTID like", value, "paicUniqueDeptid");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidNotLike(String value) {
            addCriterion("PAIC_UNIQUE_DEPTID not like", value, "paicUniqueDeptid");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidIn(List<String> values) {
            addCriterion("PAIC_UNIQUE_DEPTID in", values, "paicUniqueDeptid");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidNotIn(List<String> values) {
            addCriterion("PAIC_UNIQUE_DEPTID not in", values, "paicUniqueDeptid");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidBetween(String value1, String value2) {
            addCriterion("PAIC_UNIQUE_DEPTID between", value1, value2, "paicUniqueDeptid");
            return (Criteria) this;
        }

        public Criteria andPaicUniqueDeptidNotBetween(String value1, String value2) {
            addCriterion("PAIC_UNIQUE_DEPTID not between", value1, value2, "paicUniqueDeptid");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNull() {
            addCriterion("DATE_CREATED is null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNotNull() {
            addCriterion("DATE_CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedEqualTo(Date value) {
            addCriterion("DATE_CREATED =", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotEqualTo(Date value) {
            addCriterion("DATE_CREATED <>", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThan(Date value) {
            addCriterion("DATE_CREATED >", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_CREATED >=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThan(Date value) {
            addCriterion("DATE_CREATED <", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThanOrEqualTo(Date value) {
            addCriterion("DATE_CREATED <=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIn(List<Date> values) {
            addCriterion("DATE_CREATED in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotIn(List<Date> values) {
            addCriterion("DATE_CREATED not in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedBetween(Date value1, Date value2) {
            addCriterion("DATE_CREATED between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotBetween(Date value1, Date value2) {
            addCriterion("DATE_CREATED not between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("UPDATED_BY =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("UPDATED_BY <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("UPDATED_BY >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("UPDATED_BY <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("UPDATED_BY like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("UPDATED_BY not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("UPDATED_BY in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("UPDATED_BY not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("UPDATED_BY between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("UPDATED_BY not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedIsNull() {
            addCriterion("DATE_UPDATED is null");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedIsNotNull() {
            addCriterion("DATE_UPDATED is not null");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedEqualTo(Date value) {
            addCriterion("DATE_UPDATED =", value, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedNotEqualTo(Date value) {
            addCriterion("DATE_UPDATED <>", value, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedGreaterThan(Date value) {
            addCriterion("DATE_UPDATED >", value, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_UPDATED >=", value, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedLessThan(Date value) {
            addCriterion("DATE_UPDATED <", value, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("DATE_UPDATED <=", value, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedIn(List<Date> values) {
            addCriterion("DATE_UPDATED in", values, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedNotIn(List<Date> values) {
            addCriterion("DATE_UPDATED not in", values, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedBetween(Date value1, Date value2) {
            addCriterion("DATE_UPDATED between", value1, value2, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("DATE_UPDATED not between", value1, value2, "dateUpdated");
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