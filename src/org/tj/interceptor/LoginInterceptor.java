package org.tj.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invoker) throws Exception {
		System.out.println("ִ执行了拦截器");
		String result = invoker.invoke();
		return result;
	}

}
