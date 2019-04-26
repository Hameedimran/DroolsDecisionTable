package com.imran.droolsvalidate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.event.rule.DebugAgendaEventListener;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.glic.droolsvalidate.model.Applicant;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws FileNotFoundException {

		/*SpreadsheetCompiler converter = new SpreadsheetCompiler();
		final String drl = converter.compile(
				new FileInputStream(new File(
						"E:\\programmertechExamples\\JEE\\DroolsDecisionTable\\drooolsValidate\\src\\main\\resources\\statefulPkg\\ValidateApplicant.xlsx")),
				InputType.XLS);
		System.out.println(drl);*/
		Set<Applicant> applicants = new HashSet<>();
		applicants.add(new Applicant(1, "Raj", "25/05/1975", "M"));
		applicants.add(new Applicant(2, "Ram", "25/03/1905", "M"));
		applicants.add(new Applicant(3, "Anjali", "25/03/1993", "F"));
		applicants.add(new Applicant(4, "Rani", "01/07/1945", "F"));
		executeStatefull(applicants);

		for (Applicant applicant : applicants) {
			System.out.println(applicant.toString());
		}

	}

	public static void executeStatefull(Set<Applicant> applicants) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieBase kBase = kContainer.getKieBase("stateful");
			KieSession kSession = kBase.newKieSession();
			/*kSession.addEventListener(new DebugAgendaEventListener());
			kSession.addEventListener(new DebugRuleRuntimeEventListener());*/
			for (Applicant applicant : applicants) {
				kSession.insert(applicant);
				kSession.fireAllRules();
			}
			
			kSession.dispose();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
