package com.soa.dubbo.service.api;

public interface DemoService {

	public void sayHello();

	public String returnHello();

	public MsgInfo returnMsgInfo(MsgInfo info);

}