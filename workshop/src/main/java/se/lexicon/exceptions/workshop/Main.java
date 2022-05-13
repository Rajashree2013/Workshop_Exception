package se.lexicon.exceptions.workshop;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import se.lexicon.exceptions.workshop.data_access.NameService;
import se.lexicon.exceptions.workshop.domain.Person;
import se.lexicon.exceptions.workshop.fileIO.CSVReader_Writer;

public class Main {

	public static void main(String[] args) throws IOException,Exception {
		
		List <String> maleFirstNames = CSVReader_Writer.getMaleFirstNames();
        List <String> femaleFirstNames = CSVReader_Writer.getFemaleFirstNames();

        List <String> lastNames = CSVReader_Writer.getLastNames();


        System.out.println("femaleFirstNames -------->"+femaleFirstNames);

        NameService nameService = new NameService(maleFirstNames, femaleFirstNames,lastNames);


        Person test = nameService.getNewRandomPerson();
        System.out.println(test);


        Scanner readName = new Scanner(System.in);
        System.out.println("Enter Female First Name : ");
        String name = readName.nextLine();
        nameService.addFemaleFirstName(name);

	}

}
