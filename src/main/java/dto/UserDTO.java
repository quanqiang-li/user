package dto;

/**
 * 用户数据传输对象
 * 
 * @author aisino
 *
 */
public class UserDTO {

	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 短信验证码
	 */
	private String smsCode;
	/**
	 * 昵称
	 */
	private String nickname;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSmsCode() {
		return smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return super.toString() + "手机号为" + mobile + "证码为:" + smsCode + "昵称为:" + nickname;
	}

}
