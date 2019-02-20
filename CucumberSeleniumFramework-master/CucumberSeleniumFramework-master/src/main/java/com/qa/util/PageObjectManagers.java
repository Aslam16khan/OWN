package com.qa.util;


import org.openqa.selenium.WebDriver;

import com.qa.pages.AccountingPage;

import com.qa.pages.AdminPage;

import com.qa.pages.AdvisorPage;

import com.qa.pages.HomePage;

import com.qa.pages.ClientPage;
import com.qa.pages.CompaniesPage;
import com.qa.pages.CompliancePage;
import com.qa.pages.EmailPage;
import com.qa.pages.EmployeesPage;
import com.qa.pages.EventsPage;
import com.qa.pages.InvoicesPage;
import com.qa.pages.Login;
import com.qa.pages.ReportsPage;
import com.qa.pages.RequestPage;
import com.qa.pages.SurveysPage;



public class PageObjectManagers {

	private WebDriver driver;
	private AccountingPage accountingPage;
	private AdminPage adminPage;
	private HomePage homePage;
	private AdvisorPage advisorPage;
	private ClientPage clientPage;
	private CompaniesPage companiesPage;
	private CompliancePage compliancePage;
	private EmailPage emailPage;
	private EmployeesPage employeesPage;
	private EventsPage eventsPage;
	private InvoicesPage invoicesPage;
	private Login loginPage;
	private ReportsPage reportsPage;
	private RequestPage requestPage;
	private SurveysPage surveysPage;

	public PageObjectManagers(WebDriver driver) {

		this.driver = driver;
	}

	public HomePage getHomePage(){

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	public AccountingPage getAccountingPage() {

		return (accountingPage == null) ? accountingPage = new AccountingPage(driver) : accountingPage;
	}

	public AdvisorPage getAdvisorPage() {

		return (advisorPage == null) ? advisorPage = new AdvisorPage(driver) : advisorPage;
	}

	public AdminPage getAdminPage() {

		return (adminPage == null) ? adminPage = new AdminPage(driver) : adminPage;
	}
	public ClientPage getClientPage() {

		return (clientPage == null) ? clientPage = new ClientPage(driver) : clientPage;
	}
	public CompaniesPage getCompaniesPage() {

		return (companiesPage == null) ? companiesPage = new CompaniesPage(driver) : companiesPage;
	}
	public CompliancePage getComplaincePage() {

		return (compliancePage == null) ? compliancePage = new CompliancePage(driver) : compliancePage;
	}
	public EmailPage getEmailPage() {

		return (emailPage == null) ? emailPage = new EmailPage(driver) : emailPage;
	}
	public EmployeesPage getEmployeesPage() {

		return (employeesPage == null) ? employeesPage = new EmployeesPage(driver) : employeesPage;
	}
	public EventsPage getEventsPage() {

		return (eventsPage == null) ? eventsPage = new EventsPage(driver) : eventsPage;
	}
	public InvoicesPage getInvoicesPage() {

		return (invoicesPage == null) ? invoicesPage = new InvoicesPage(driver) : invoicesPage;
	}
	
	public ReportsPage getReportsPage() {

		return (reportsPage == null) ? reportsPage = new ReportsPage(driver) : reportsPage;
	}
	public RequestPage getRequestPage() {

		return (requestPage == null) ? requestPage = new RequestPage(driver) : requestPage;
	}
	public SurveysPage getSurveysPage() {

		return (surveysPage == null) ? surveysPage = new SurveysPage(driver) : surveysPage;
	}
	public Login getLoginPage() {

		return (loginPage == null) ? loginPage = new Login(driver) : loginPage;
	}
}