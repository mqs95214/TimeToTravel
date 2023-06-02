package com.tibame.timetotravel.service;

import com.tibame.timetotravel.dto.SearchRoomDto;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface SearchService {
    public List<SearchRoomDto> findAvailableCompany(String keyWord, Integer people, String start, String end) throws InvocationTargetException, IllegalAccessException;
}
