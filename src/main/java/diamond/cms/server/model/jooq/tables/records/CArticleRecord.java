/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables.records;


import diamond.cms.server.model.jooq.tables.CArticle;
import diamond.cms.server.model.jooq.tables.interfaces.ICArticle;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class CArticleRecord extends UpdatableRecordImpl<CArticleRecord> implements Record10<String, String, String, String, Integer, Timestamp, Timestamp, String, String, String>, ICArticle {

    private static final long serialVersionUID = -990583967;

    /**
     * Setter for <code>cms.c_article.id</code>.
     */
    @Override
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>cms.c_article.id</code>.
     */
    @NotNull
    @Size(max = 40)
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>cms.c_article.title</code>.
     */
    @Override
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cms.c_article.title</code>.
     */
    @NotNull
    @Size(max = 255)
    @Override
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cms.c_article.content</code>.
     */
    @Override
    public void setContent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cms.c_article.content</code>.
     */
    @Size(max = 65535)
    @Override
    public String getContent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cms.c_article.summary</code>. 文章摘要
     */
    @Override
    public void setSummary(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cms.c_article.summary</code>. 文章摘要
     */
    @Size(max = 300)
    @Override
    public String getSummary() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cms.c_article.status</code>. 0: 删除状态
1: 草稿状态
2: 发布状态
     */
    @Override
    public void setStatus(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>cms.c_article.status</code>. 0: 删除状态
1: 草稿状态
2: 发布状态
     */
    @Override
    public Integer getStatus() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>cms.c_article.create_time</code>.
     */
    @Override
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>cms.c_article.create_time</code>.
     */
    @Override
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>cms.c_article.update_time</code>.
     */
    @Override
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>cms.c_article.update_time</code>.
     */
    @Override
    public Timestamp getUpdateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>cms.c_article.catalog_id</code>.
     */
    @Override
    public void setCatalogId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>cms.c_article.catalog_id</code>.
     */
    @Size(max = 40)
    @Override
    public String getCatalogId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>cms.c_article.banner</code>.
     */
    @Override
    public void setBanner(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>cms.c_article.banner</code>.
     */
    @Size(max = 150)
    @Override
    public String getBanner() {
        return (String) get(8);
    }

    /**
     * Setter for <code>cms.c_article.tag_names</code>.
     */
    @Override
    public void setTagNames(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>cms.c_article.tag_names</code>.
     */
    @Size(max = 300)
    @Override
    public String getTagNames() {
        return (String) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, Integer, Timestamp, Timestamp, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, Integer, Timestamp, Timestamp, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CArticle.C_ARTICLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CArticle.C_ARTICLE.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CArticle.C_ARTICLE.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CArticle.C_ARTICLE.SUMMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CArticle.C_ARTICLE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return CArticle.C_ARTICLE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return CArticle.C_ARTICLE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CArticle.C_ARTICLE.CATALOG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CArticle.C_ARTICLE.BANNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CArticle.C_ARTICLE.TAG_NAMES;
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
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSummary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCatalogId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBanner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getTagNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CArticleRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CArticleRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CArticleRecord value3(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CArticleRecord value4(String value) {
        setSummary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CArticleRecord value5(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CArticleRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CArticleRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CArticleRecord value8(String value) {
        setCatalogId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CArticleRecord value9(String value) {
        setBanner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CArticleRecord value10(String value) {
        setTagNames(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CArticleRecord values(String value1, String value2, String value3, String value4, Integer value5, Timestamp value6, Timestamp value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ICArticle from) {
        setId(from.getId());
        setTitle(from.getTitle());
        setContent(from.getContent());
        setSummary(from.getSummary());
        setStatus(from.getStatus());
        setCreateTime(from.getCreateTime());
        setUpdateTime(from.getUpdateTime());
        setCatalogId(from.getCatalogId());
        setBanner(from.getBanner());
        setTagNames(from.getTagNames());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ICArticle> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CArticleRecord
     */
    public CArticleRecord() {
        super(CArticle.C_ARTICLE);
    }

    /**
     * Create a detached, initialised CArticleRecord
     */
    public CArticleRecord(String id, String title, String content, String summary, Integer status, Timestamp createTime, Timestamp updateTime, String catalogId, String banner, String tagNames) {
        super(CArticle.C_ARTICLE);

        set(0, id);
        set(1, title);
        set(2, content);
        set(3, summary);
        set(4, status);
        set(5, createTime);
        set(6, updateTime);
        set(7, catalogId);
        set(8, banner);
        set(9, tagNames);
    }
}
