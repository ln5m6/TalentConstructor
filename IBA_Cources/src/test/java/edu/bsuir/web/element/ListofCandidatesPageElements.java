package edu.bsuir.web.element;

import edu.bsuir.element.Element;
import org.openqa.selenium.By;

public class ListofCandidatesPageElements {


    public static final String URL = "http://testing.cld.iba.by/web/guest/recruiting/candidates/";

    public static final Element CLEAR_FILTER = new Element("Очистить фильтр", By.xpath("//a[@id='filter-clear-link']"));
    public static final Element SELECT_EXPIRIENCE = new Element("Выбрать опыт работы", By.xpath("//select[@id='experience']"));

    public static final Element STATUS_NEW = new Element("Статус Новый", By.xpath("//input[@id='status_New']"));
    public static final Element STATUS_ON_APPROVAL = new Element("Статус рассматривается на вакансию", By.xpath("//input[@id='status_OnApprovalForTheVacancy']"));
    public static final Element STATUS_AVAILABLE_APPROVAL = new Element("Статус доступен на вакансию", By.xpath("//input[@id='status_AvailableForApproval']"));

    public static final Element BUTTON_VACANCIES = new Element("Выбрать вакансию", By.xpath("//div[@id='vacancy_filter']//button"));
    public static final Element VACANCY_DESIGNER = new Element("Вакансия дизайнер", By.xpath("//input[@id='vacancy_filtermultiselect-0']"));
    public static final Element SELECT_VACANCIES = new Element("Поиск вакансии", By.xpath("//div[@id='vacancy_filter']//input[@id='searchInput']"));

    public static final Element RELOCATION_AVAILABLE = new Element("Переезд возможен", By.xpath("//input[@id='relocation_Available']"));
    public static final Element RELOCATION_UNAVAILABLE = new Element("Переезд невозможен", By.xpath("//input[@id='relocation_Unavailable']"));

    public static final Element BUTTON_EDUCATION = new Element("Кнопка выбора образования", By.xpath("//div[@id='education_filter']//button"));
    public static final Element EDUCATION_NOT_SPECIFIED = new Element("Образования нет", By.xpath("//input[@id='education_filtermultiselect-0']"));
    public static final Element EDUCATION_AVERAGE = new Element("Образование среднее", By.xpath("//input[@id='education_filtermultiselect-1']"));
    public static final Element SEARCH_EDUCATION = new Element("Поиск образования", By.xpath("//div[@id='education_filter']//input[@id='searchInput']"));


    public static final Element BUTTON_UNIVERSITY = new Element("Кнопка выбора университета", By.xpath("//div[@id='universities_filter']//button"));
    public static final Element UNIVERSITY_BSU = new Element("Университет БГУ", By.xpath("//input[@id='universities_filtermultiselect-0']"));
    public static final Element UNIVERSITY_BSUIR = new Element("Университет БГУИР", By.xpath("//input[@id='universities_filtermultiselect-1']"));
    public static final Element SEARCH_UNIVERSITY = new Element("Поиск университета", By.xpath("//div[@id='education_filter']//input[@id='searchInput']"));

    public static final Element BUTTON_COMPETENCE = new Element("Кнопка выбора компетенции", By.xpath("//div[@id='competencies_filter']//button"));
    public static final Element COMPETENCE_MS_ACCESS = new Element("Компетенция MS Access", By.xpath("//input[@id='competencies_filtermultiselect-0']"));
    public static final Element SEARCH_COMPETENCE = new Element("Поиск компетенции", By.xpath("//div[@id='education_filter']//input[@id='searchInput']"));

    public static final Element SEARCH_CANDIDATE = new Element("Поиск компетенции", By.xpath("//div[@class='search-row row-fluid col-xs-12']//input"));
    public static final Element BUTTON_NEW_CANDIDATE = new Element("Поиск компетенции", By.xpath("//a[@id='createProfileButton']"));
    public static final Element CANDIDATE_ROGOVA = new Element("Поиск компетенции", By.xpath("//div[@id='candidates-table']//a[contains(@href,'16')]"));
    public static final Element CANDIDATE_ROGOVA_PHOTO = new Element("Поиск компетенции", By.xpath("//div[@id='candidates-table']//a[contains(@href,'16') and span]"));

    public static final Element FIND_FIRST_CANDIDATE = new Element("Поиск компетенции", By.xpath("//div[@class='table-container']//a/span"));

public static final Element SEARCH_EMPTY_MESSAGE = new Element("Поиск компетенции", By.xpath("//tc-alert[@id='emptyListSearch']//div[@class='message']"));


}