package com.example.web.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.model.Region;
import com.example.web.repository.RegionRepository;
import com.example.web.service.RegionService;

@Service
public class RegionServiceImpl implements RegionService{

	@Autowired
	private RegionRepository regionRepository;
	
	@Override
	public List<Region> listRegions() {
		// TODO Auto-generated method stub
		return regionRepository.findAll();
	}

	@Override
	public Region saveRegion(Region region) {
		// TODO Auto-generated method stub
		return regionRepository.save(region);
	}

	@Override
	public Region updateRegion(Region region) {
		// TODO Auto-generated method stub
		return regionRepository.save(region);
	}

	@Override
	public String deleteRegion(Region region) {
		// TODO Auto-generated method stub
		regionRepository.delete(region);
		return "delete done";
	}

}
