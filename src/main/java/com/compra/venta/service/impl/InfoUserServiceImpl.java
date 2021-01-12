package com.compra.venta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.compra.venta.bean.InfoUserBean;
import com.compra.venta.model.InfoUser;
import com.compra.venta.repository.InfoUserRepository;
import com.compra.venta.service.InfoUserService;

@Service
@Transactional
public class InfoUserServiceImpl implements InfoUserService {

	@Autowired
	private InfoUserRepository infoUserRepo;
	
	@Override
	public int saveInfo(InfoUserBean infoUserBean) {
		InfoUser infoUser = new InfoUser();
		infoUser.setFirstName(infoUserBean.getFirstName());
		infoUser.setLastName(infoUserBean.getLastName());
		infoUser.setUserAddr(infoUserBean.getUserAddr());
		this.infoUserRepo.save(infoUser);
		return infoUser.getIdInfo();
	}

	@Override
	public boolean updateInfo(InfoUserBean infoUserBean) {
		InfoUser infoUser = this.infoUserRepo.findById(infoUserBean.getIdInfo()).orElseThrow();
		infoUser.setFirstName(infoUserBean.getFirstName());
		infoUser.setLastName(infoUserBean.getLastName());
		infoUser.setUserAddr(infoUserBean.getUserAddr());
		this.infoUserRepo.save(infoUser);
		return true;
	}

	@Override
	public InfoUserBean getInfo(int idInfo) {
		InfoUser infoUser = this.infoUserRepo.findById(idInfo).orElseThrow();
		InfoUserBean infoUserBean = new InfoUserBean();
		infoUserBean.setIdInfo(infoUser.getIdInfo());
		infoUserBean.setFirstName(infoUser.getFirstName());
		infoUserBean.setLastName(infoUser.getLastName());
		infoUserBean.setUserAddr(infoUser.getUserAddr());
		return infoUserBean;
	}

	@Override
	public List<InfoUserBean> getInfoUsers() {
		List<InfoUser> infoUserList = this.infoUserRepo.findAll();
		List<InfoUserBean> infoUserBeanList = new ArrayList<>();
		for(int i = 0; i < infoUserList.size(); i++) {
			InfoUserBean infoUserBean = new InfoUserBean();
			infoUserBean.setIdInfo(infoUserList.get(i).getIdInfo());
			infoUserBean.setFirstName(infoUserList.get(i).getFirstName());
			infoUserBean.setLastName(infoUserList.get(i).getLastName());
			infoUserBean.setUserAddr(infoUserList.get(i).getUserAddr());
			infoUserBeanList.add(infoUserBean);
		}
		return infoUserBeanList;
	}

	@Override
	public boolean deletInfo(int idInfo) {
		InfoUser infoUser = this.infoUserRepo.findById(idInfo).orElseThrow();
		this.infoUserRepo.delete(infoUser);
		return true;
	}

}
