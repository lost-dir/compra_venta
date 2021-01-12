package com.compra.venta.service;

import java.util.List;

import com.compra.venta.bean.InfoUserBean;

public interface InfoUserService {
	public int saveInfo(InfoUserBean infoUserBean);
	public boolean updateInfo(InfoUserBean infoUserBean);
	public InfoUserBean getInfo(int idInfo);
	public List<InfoUserBean> getInfoUsers();
	public boolean deletInfo(int idInfo);
}
