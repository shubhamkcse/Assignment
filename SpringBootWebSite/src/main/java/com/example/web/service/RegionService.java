package com.example.web.service;

import java.util.List;

import com.example.web.model.Region;

public interface RegionService {

	public List<Region> listRegions();
	public Region saveRegion(Region region);
	public Region updateRegion(Region region);
	public String deleteRegion(Region region);
	
}
