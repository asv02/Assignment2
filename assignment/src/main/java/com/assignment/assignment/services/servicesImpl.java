package com.assignment.assignment.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.assignment.entities.Load;
import com.assignment.assignment.loadDao.LoadDao;
@Service
public class servicesImpl implements LoadServices {
	@Autowired
	private LoadDao loaddao;
	
  
	@Override
	public String addLoad(Load load) {
		loaddao.save(load);
        return "loads details added successfully ";
	}

	@Override
	public List<Load> listgetbyId(String id) {
              return loaddao.findByShipperId(id);
	}

	@Override
	public Load getbyId(int id) {
		Optional<Load> o=loaddao.findById(id);
		if(o.get()==null) {
			return null;
		}
		return o.get();
	}

	@Override
	public String updatebyId(Load load,int id) {
      Load l = loaddao.findById(id).orElse(null);
    if (l == null) {
        return "Load Not Found";
    }
    l.setLoadingPoint(load.getLoadingPoint());
    l.setUnloadingPoint(load.getUnloadingPoint());
    l.setProductType(load.getProductType());
    l.setTruckType(load.getTruckType());
    l.setNoOfTrucks(load.getNoOfTrucks());
    l.setWeight(load.getWeight());
//    l.setComment(load.getComment());
    l.setDate(load.getDate());
    loaddao.save(l);
    return "Load Updated";		
	}
	
    @Override
    public String deleteById(int loadId){
        Load l=loaddao.findById(loadId).orElse(null);
        if(l==null){
            return "Load Not Found";
        }
        loaddao.delete(l);
        return "Load Deleted";
    }
}
