package com.uptc.edu.ms.vehciles.utils.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Component;

import com.uptc.edu.ms.vehciles.utils.FilesUtils;

@Component
public class FilesUtilsImpl implements FilesUtils {

	@Override
	public void write(String path, String lineData) throws IOException {
		try {
			File file = new File(path);
			PrintWriter writer = new PrintWriter(new FileWriter(file, true));
			
			writer.println(lineData);
			writer.close();
		} catch (IOException e) {
			throw e;
		}
		
	}

}
