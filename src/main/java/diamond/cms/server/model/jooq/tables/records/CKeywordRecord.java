/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables.records;


import diamond.cms.server.model.jooq.tables.CKeyword;
import diamond.cms.server.model.jooq.tables.interfaces.ICKeyword;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CKeywordRecord extends UpdatableRecordImpl<CKeywordRecord> implements Record6<String, String, Integer, String, String, Integer>, ICKeyword {

    private static final long serialVersionUID = 1713934773;

    /**
     * Setter for <code>cms.c_keyword.id</code>.
     */
    @Override
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>cms.c_keyword.id</code>.
     */
    @NotNull
    @Size(max = 40)
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>cms.c_keyword.keyword</code>.
     */
    @Override
    public void setKeyword(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cms.c_keyword.keyword</code>.
     */
    @NotNull
    @Size(max = 80)
    @Override
    public String getKeyword() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cms.c_keyword.ref_number</code>.
     */
    @Override
    public void setRefNumber(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>cms.c_keyword.ref_number</code>.
     */
    @Override
    public Integer getRefNumber() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>cms.c_keyword.full_pinyin</code>.
     */
    @Override
    public void setFullPinyin(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cms.c_keyword.full_pinyin</code>.
     */
    @NotNull
    @Size(max = 300)
    @Override
    public String getFullPinyin() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cms.c_keyword.simple_pinyin</code>.
     */
    @Override
    public void setSimplePinyin(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cms.c_keyword.simple_pinyin</code>.
     */
    @NotNull
    @Size(max = 80)
    @Override
    public String getSimplePinyin() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cms.c_keyword.heat_number</code>.
     */
    @Override
    public void setHeatNumber(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>cms.c_keyword.heat_number</code>.
     */
    @Override
    public Integer getHeatNumber() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, Integer, String, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, Integer, String, String, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CKeyword.C_KEYWORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CKeyword.C_KEYWORD.KEYWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CKeyword.C_KEYWORD.REF_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CKeyword.C_KEYWORD.FULL_PINYIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CKeyword.C_KEYWORD.SIMPLE_PINYIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return CKeyword.C_KEYWORD.HEAT_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getKeyword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getRefNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFullPinyin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSimplePinyin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getHeatNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CKeywordRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CKeywordRecord value2(String value) {
        setKeyword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CKeywordRecord value3(Integer value) {
        setRefNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CKeywordRecord value4(String value) {
        setFullPinyin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CKeywordRecord value5(String value) {
        setSimplePinyin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CKeywordRecord value6(Integer value) {
        setHeatNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CKeywordRecord values(String value1, String value2, Integer value3, String value4, String value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ICKeyword from) {
        setId(from.getId());
        setKeyword(from.getKeyword());
        setRefNumber(from.getRefNumber());
        setFullPinyin(from.getFullPinyin());
        setSimplePinyin(from.getSimplePinyin());
        setHeatNumber(from.getHeatNumber());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ICKeyword> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CKeywordRecord
     */
    public CKeywordRecord() {
        super(CKeyword.C_KEYWORD);
    }

    /**
     * Create a detached, initialised CKeywordRecord
     */
    public CKeywordRecord(String id, String keyword, Integer refNumber, String fullPinyin, String simplePinyin, Integer heatNumber) {
        super(CKeyword.C_KEYWORD);

        set(0, id);
        set(1, keyword);
        set(2, refNumber);
        set(3, fullPinyin);
        set(4, simplePinyin);
        set(5, heatNumber);
    }
}
