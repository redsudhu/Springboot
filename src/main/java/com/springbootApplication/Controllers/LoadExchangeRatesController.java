package com.springbootApplication.Controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbootApplication.entity.ExchangeRate;
import com.springbootApplication.entity.RateExchange;

@RestController
public class LoadExchangeRatesController {
	
	@Autowired
	RestTemplate restTemplate ;
	@RequestMapping("loadData/{date}")
	public ExchangeRate getExchangeRates(@PathVariable("date") String date) {
		
		ExchangeRate exchangeRate = (ExchangeRate) restTemplate.getForObject("https://api.ratesapi.io/api/" + date,
				ExchangeRate.class);
		return exchangeRate;
	}

	// stub
	@RequestMapping("getdata/{date}/{currency}")
	public RateExchange getDataFromDB(@PathVariable("date") String date, @PathVariable("currency") String currency) {
		ExchangeRate exchangeRate = getExchangeRatesStub(date);
		ObjectMapper oMapper = new ObjectMapper();
		Map<String, Float> map = oMapper.convertValue(exchangeRate.getRates(), Map.class);
		RateExchange rateExchange = new RateExchange();
		System.out.println(map.get(currency));
		rateExchange.setExchangeRate(map.get(currency));
		rateExchange.setDate(date);
		rateExchange.setCurrencey(currency);

		return rateExchange;
	}

	private  ExchangeRate getExchangeRatesStub(String date) {
		ExchangeRate exchangeRate = (ExchangeRate) restTemplate.getForObject("https://api.ratesapi.io/api/" + date,
				ExchangeRate.class);
		return exchangeRate;
	}

}
