package com.repeat;

import java.io.File;

public class FileRenameDemo {

	public static void main(String[] args) {
		File oldName = new File("C:/Users/S967139/OneDrive - Emirates Group/Desktop/TestFile/natbil280223.txt.asc");
	    File newName = new File("C:/Users/S967139/OneDrive - Emirates Group/Desktop/TestFile/NY.PISCESSW.#D.BULK.EMIR.DATA.PGP");

	    if(oldName.renameTo(newName)) {
	         System.out.println("renamed");
	      } else {
	         System.out.println("Error");
	      }
	}

}
