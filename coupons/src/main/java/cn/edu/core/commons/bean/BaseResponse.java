package cn.edu.core.commons.bean;

import java.io.Serializable;

/**
 * 基础返回对象
 * 
 * @author KB
 *
 */
public class BaseResponse<T> implements Serializable {

	private static final long serialVersionUID = 7620544582929442162L;

	private int code=200;
	private boolean success=true;
	private String message = "";
	private T data;

	/**
	 * 设置响应的错误信息
	 * 
	 * @param code
	 *            错误信息代码
	 * @param errMsg
	 *            错误信息提示
	 */
	public void setError(int code, String errMsg) {
		this.code = code;
		this.message = errMsg;
		this.success=false;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
