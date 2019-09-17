package com.example.businessdemo.response.exception;

public enum ExceptionCode {

    /**
     * 对外异常、交易异常相关错误E400
     */
    TRADE_QUERY_MISS("E40001", "未查询到客户数据！"),
    TRADE_GROUP_OVER_NUM("E40002", "租户访问次数已到达上限！"),
    TRADE_USER_OVER_NUM("E40003", "用户访问次数已到达上限！"),
    TRADE_GROUP_ERROR_TIME_CONFIG("E40004", "租户时间计费配置信息错误，请联系0592-2155941"),
    TRADE_USER_ERROR_TIME_CONFIG("E40005", "用户时间计费配置信息错误，请联系0592-2155941"),
    TRADE_GROUP_OVER_TIME("E40006", "租户访问不在设定时间范围内！"),
    TRADE_USER_OVER_TIME("E40007", "用户访问不在设定时间范围内！"),
    TRADE_GROUP_NOT_EXIST("E40008", "用户未关联租户"),
    TRADE_NO_BILL_TYPE("E40009", "初始化失败，未加载到任何计费方式"),
    TRADE_MISS_NUM_CONFIG("E40010", "租户缺少次数计费配置信息！"),
    TRADE_MISS_TIME_CONFIG("E40011", "租户缺少时间计费配置信息！"),
    TRADE_VERIFY_ERROR("E40012", "用户权限校验失败！"),
    TRADE_USC_ERROR("E40013", "统一社会信用代码不合法！"),
    TRADE_PARAM_REQUIRED("E40014", "必要参数缺失！"),
    TRADE_TASK_STATUS_CHANGE_ERROR("E40015", "无法变更到目标状态！"),
    TRADE_TASK_NOT_EXIST("E40016", "获取任务失败！"),
    TRADE_TASK_STATUS_ERROR("E40017", "状态错误，无法执行！"),
    TRADE_TASK_SHEET_NOT_EXIST("E40018", "查询条件sheet不存在！"),
    TRADE_TASK_FILE_IO_EXCEPTION("E40019", "文件操作失败！"),
    TRADE_TASK_FILE_NOT_EXIST("E40020", "文件获取失败！"),
    TRADE_TRADE_CODE_NOT_EXIST("E40021", "交易码获取失败！"),
    TRADE_GROUP_NULL_NUMBER_CONFIG("E40022", "请联系0592-2155941，购买相关服务"),
    TRADE_GROUP_NULL_TIME_CONFIG("E40023", "请联系0592-2155941，购买相关服务"),
    TRADE_PORTAL_PARAM_NOT_EXIST("E40024", "产品参数获取失败，请联系0592-2155941"),
    WARN_CUSTOMER_EXIST("E40025", "客户信息已存在！"),
    TRADE_CERT_TYPE_ERROR("E40026", "客户证件类型错误！"),
    TRADE_DATA_ERROR_NULL_PERSON_LIST("E40028", "工商【企业主要管理人员信息列表】为空，无法测算！"),
    TRADE_DATA_ERROR_RSP("E40029", "工商信息获取异常"),
    TRADE_CERT_FORMAT_ERROR("E40030", "客户证件号格式错误"),

    /**
     * 用户模块相关错误E001
     */
    USER_USER_EXIST("E00101", "用户已存在!"),
    USER_ID_NOT_EXIST("E00102", "缺少用户唯一标识"),
    USER_USER_NOT_EXIST("E00103", "用户不存在"),
    USER_USERNAME_NOT_EXIST("E00104", "用户名缺失！"),
    USER_GROUP_ID_NOT_EXIST("E00105", "租户信息获取失败！"),
    USER_DELETE_ADMIN("E00106", "无法删除管理员账号！"),
    USER_DELETE_LOGINING("E00107", "无法删除登录账号！"),


    /**
     * 角色模块相关错误E002
     */
    ROLE_ROLE_NOT_EXIST("E00201", "角色信息获取失败！"),
    ROLE_ROLE_ID_NOT_EXIST("E00202", "角色ID不存在！"),
    ROLE_ROLE_NAME_NOT_EXIST("E00203", "角色名称不存在！"),
    ROLE_ROLE_NAME_EXIST("E00204", "角色名称已存在！"),

    /**
     * 菜单模块相关错误E003
     */
    MENU_ID_NOT_EXIST("E00301", "菜单ID获取失败！"),
    MENU_NOT_EXIST("E00302", "菜单不存在！"),
    MENU_PARENT_ID_NOT_EXIST("E00303", "父级菜单ID获取失败！"),
    MENU_PARENT_ID_UPDATE_ERROR("E00304", "父级菜单指定错误！"),
    MENU_PARENT_MENU_NOT_EXIST("E00305", "父级菜单不存在！"),
    MENU_ROLE_ID_NOT_EXIST("E00306", "角色ID获取失败！"),

    /**
     * 登录模块相关错误E009开始
     * */
    LOGIN_USERNAME_NOT_EXIST("E00901", "用户名不能为空"),
    LOGIN_PASSWORD_NOT_EXIST("E00902", "密码不能为空"),
    LOGIN_USER_NOT_EXIST("E00903", "用户不存在"),
    LOGIN_PASSWORD_INCORRECT("E00904", "密码错误,请重新输入"),
    LOGIN_TIMEOUT("E00999", "用户登录超时，请重新登录。"),

    UPLOAD_NO_FILE("E00018", "无法获取文件！"),
    COMMON_DATA_NOT_EXIST("E00918", "数据不存在！"),

    BUSINESS_EXCEPTION("E00000", "%s"),
    MISS_REQUEST_PARAMETER("E40999", "缺失必填数据！"),

    /**通用异常编码*/
    SYS_DB_OPERATION_ERROR("E90001", "数据库操作异常，请稍后再试！"),
    SYS_EXCEPTION("E99999", "未知错误，请联系0592-2155941");

    private String code;
    private String msg;

    ExceptionCode(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public String code(){
        return code;
    }

    public String msg(){
        return msg;
    }

}
