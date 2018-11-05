package com.himant.app;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({SingletonDemo.class})
public class ApplicationTest {

	@Test
	public void shouldReturnZero() {
		PowerMockito.mockStatic(SingletonDemo.class);
		HelloWorld mockedHelloWorld = PowerMockito.mock(HelloWorld.class); 
		Mockito.when(SingletonDemo.getInstance()).thenReturn(mockedHelloWorld);
		Mockito.when(mockedHelloWorld.getNumber()).thenReturn(1);
		
		Application app = new Application();
		int result = app.doSomething();
		Assert.assertEquals(2, result);
	}
}
