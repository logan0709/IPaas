package com.cloud.paas.imageregistry.model;

import javax.validation.constraints.NotNull;

/**
 * @Author: 17798
 * @Description: 镜像版本规则实体类
 * @Date: Create in 11:19 2018/03/22
 * @Modified by:
 */
public class ImageVersionRule extends ValueObject {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acp_image_version_rule.rule_id
     * 镜像版本规则编号
     * @mbggenerated Thu Mar 22 09:53:35 GMT+08:00 2018
     */
    private Integer ruleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acp_image_version_rule.base_image_version_id
     * 镜像版本编号
     * @mbggenerated Thu Mar 22 09:53:35 GMT+08:00 2018
     */
    @NotNull(message = "{image.imageid.notblank}",groups = ImageVersion.ImageVersionAddValidate.class)
    private Integer baseImageVersionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acp_image_version_rule.expose_port
     * 暴露端口
     * @mbggenerated Thu Mar 22 09:53:35 GMT+08:00 2018
     */
    private String exposePort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acp_image_version_rule.publish_path
     * 安装路径
     * @mbggenerated Thu Mar 22 09:53:35 GMT+08:00 2018
     */
    private String publishPath;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acp_image_version_rule.rule_id
     *
     * @return the value of acp_image_version_rule.rule_id
     *
     * @mbggenerated Thu Mar 22 09:53:35 GMT+08:00 2018
     */
    public Integer getRuleId() {
        return ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acp_image_version_rule.rule_id
     *
     * @param ruleId the value for acp_image_version_rule.rule_id
     *
     * @mbggenerated Thu Mar 22 09:53:35 GMT+08:00 2018
     */
    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acp_image_version_rule.base_image_version_id
     *
     * @return the value of acp_image_version_rule.base_image_version_id
     *
     * @mbggenerated Thu Mar 22 09:53:35 GMT+08:00 2018
     */
    public Integer getBaseImageVersionId() {
        return baseImageVersionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acp_image_version_rule.base_image_version_id
     *
     * @param baseImageVersionId the value for acp_image_version_rule.base_image_version_id
     *
     * @mbggenerated Thu Mar 22 09:53:35 GMT+08:00 2018
     */
    public void setBaseImageVersionId(Integer baseImageVersionId) {
        this.baseImageVersionId = baseImageVersionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acp_image_version_rule.expose_port
     *
     * @return the value of acp_image_version_rule.expose_port
     *
     * @mbggenerated Thu Mar 22 09:53:35 GMT+08:00 2018
     */
    public String getExposePort() {
        return exposePort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acp_image_version_rule.expose_port
     *
     * @param exposePort the value for acp_image_version_rule.expose_port
     *
     * @mbggenerated Thu Mar 22 09:53:35 GMT+08:00 2018
     */
    public void setExposePort(String exposePort) {
        this.exposePort = exposePort == null ? null : exposePort.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acp_image_version_rule.publish_path
     *
     * @return the value of acp_image_version_rule.publish_path
     *
     * @mbggenerated Thu Mar 22 09:53:35 GMT+08:00 2018
     */
    public String getPublishPath() {
        return publishPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acp_image_version_rule.publish_path
     *
     * @param publishPath the value for acp_image_version_rule.publish_path
     *
     * @mbggenerated Thu Mar 22 09:53:35 GMT+08:00 2018
     */
    public void setPublishPath(String publishPath) {
        this.publishPath = publishPath == null ? null : publishPath.trim();
    }
}