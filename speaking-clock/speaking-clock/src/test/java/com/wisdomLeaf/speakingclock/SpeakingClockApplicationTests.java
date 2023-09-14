package com.wisdomLeaf.speakingclock;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.wisdomLeaf.speakingclock.repository.TimeConversionRepository;
import com.wisdomLeaf.speakingclock.serviceImplementation.TimeConversionServiceImpl;

@SpringBootTest
class SpeakingClockApplicationTests {

	@Test
	void contextLoads() {
	}

	@InjectMocks
	private TimeConversionServiceImpl timeConversionService;
	@Mock
	private TimeConversionRepository timeConversionRepository;

	@SuppressWarnings("deprecation")
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testConvertTimeToWords_ValidTime() {
		String inputTime = "08:34";

		String convertedTime = timeConversionService.convertTimeToWords(inputTime);

		assertEquals("It's eight thirty-four", convertedTime);
	}

	@Test
	public void testConvertTimeToWords_Midday() {
		String inputTime = "12:00";

		String convertedTime = timeConversionService.convertTimeToWords(inputTime);

		assertEquals("It's Midday", convertedTime);
	}

	@Test
	public void testConvertTimeToWords_Midnight() {
		String inputTime = "00:00";

		String convertedTime = timeConversionService.convertTimeToWords(inputTime);

		assertEquals("It's Midnight", convertedTime);
	}
}
