package com.ruban.service;

import com.ruban.model.CurrencyRate;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

public interface IRateService {
    List<CurrencyRate> findByValuteId(String id);
    List<CurrencyRate> findByDateAndValuteIds(Date date, String valuteId1, String valuteId2) throws IOException, SAXException, ParserConfigurationException;
    void save(CurrencyRate currencyRate);
    List<CurrencyRate> getByDateAndValuteId(Date date, String valuteId);
}
