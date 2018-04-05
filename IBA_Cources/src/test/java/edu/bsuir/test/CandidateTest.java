package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.page.ListofCandidatesPage;
import edu.bsuir.web.page.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import edu.bsuir.general.Login;

public class CandidateTest extends Login {

    private WebDriver driver = WebDriverSingleton.getInstance();

    private MainPage mp = new MainPage();
    private ListofCandidatesPage lcp = new ListofCandidatesPage();

    public static final String ROLE = "HR";

    public static final String ROGOVA_PAGE = "Рогова Светлана Михайловна - Конструктор Талантов";
    public static final String ROGOVA = "Рогова Светлана Михайловна";
    public static final String ROGOVA_SURNAME = "Рогова";
    public static final String ROGOVA_SURNAME_WITH_WRONG_CHARACTERS_1 = "Рогова 22222";
    public static final String ROGOVA_SURNAME_WITH_WRONG_CHARACTERS_2 = "222 Рогова";
    public static final String ROGOVA_SURNAME_WITH_WRONG_CHARACTERS_3 = "222 Рогова 222";
    public static final String ROGOVA_SURNAME_WITH_WRONG_CHARACTERS_4 = "Рогова2";
    public static final String ROGOVA_NAME = "Светлана";
    public static final String ROGOVA_SECOND_NAME = "Михайловна";
    public static final String ROGOVA_SURNAME_WITH_SPACE_BETWEEN_LETTERS = "Р о г о в а";
    public static final String ROGOVA_SURNAME_WITH_SPACE = "      Рогова    ";
    public static final String SEARCH_EMPTY_MESSAGE = "Список кандидатов пуст";
    public static final String CREATE_CANDIDATE_PAGE = "Создание резюме - Конструктор Талантов";


    @Before
    public void init() throws InterruptedException {
        driver = WebDriverSingleton.getInstance();
        super.loginUser(ROLE);
    }

    @Test
    public void clickRogova () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCandidateRogova();
        Assert.assertEquals(ROGOVA_PAGE, driver.getTitle());
    }

    @Test
    public void clickRogovaPhoto () throws InterruptedException {
        lcp.enterPage();
        Thread.sleep(1000);
        lcp.clickCandidateRogovaPhoto();
        Assert.assertEquals(ROGOVA_PAGE, driver.getTitle());
    }

    @Test
    public void searchCandidateBySurname () throws InterruptedException {
        lcp.enterPage();
        lcp.searchCandidate(ROGOVA_SURNAME);
        Assert.assertEquals(ROGOVA, lcp.getFirstFindCandidate());
    }

    @Test
    public void searchCandidateByName () throws InterruptedException {
        lcp.enterPage();
        lcp.searchCandidate(ROGOVA_NAME);
        Assert.assertEquals(ROGOVA, lcp.getFirstFindCandidate());
    }

    @Test
    public void searchCandidateBySecondName () throws InterruptedException {
        lcp.enterPage();
        lcp.searchCandidate(ROGOVA_SECOND_NAME);
        Assert.assertEquals(ROGOVA, lcp.getFirstFindCandidate());
    }

    @Test
    public void searchCandidateWithWrongCharacters_1 () throws InterruptedException {
        lcp.enterPage();
        Thread.sleep(1000);
        lcp.searchCandidate(ROGOVA_SURNAME_WITH_WRONG_CHARACTERS_1);
        Assert.assertEquals(SEARCH_EMPTY_MESSAGE, lcp.getMessageEmptySearch());
    }

    @Test
    public void searchCandidateWithWrongCharacters_2 () throws InterruptedException {
        lcp.enterPage();
        lcp.searchCandidate(ROGOVA_SURNAME_WITH_WRONG_CHARACTERS_2);
        Assert.assertEquals(SEARCH_EMPTY_MESSAGE, lcp.getMessageEmptySearch());
    }

    @Test
    public void searchCandidateWithWrongCharacters_3 () throws InterruptedException {
        lcp.enterPage();
        Thread.sleep(1000);
        lcp.searchCandidate(ROGOVA_SURNAME_WITH_WRONG_CHARACTERS_3);
        Thread.sleep(1000);
        Assert.assertEquals(SEARCH_EMPTY_MESSAGE, lcp.getMessageEmptySearch());
    }

    @Test
    public void searchCandidateWithWrongCharacters_4 () throws InterruptedException {
        lcp.enterPage();
        lcp.searchCandidate(ROGOVA_SURNAME_WITH_WRONG_CHARACTERS_4);
        Assert.assertEquals(SEARCH_EMPTY_MESSAGE, lcp.getMessageEmptySearch());
    }

    @Test
    public void searchCandidateWithSpaceBetweenLetters () throws InterruptedException {
        lcp.enterPage();
        lcp.searchCandidate(ROGOVA_SURNAME_WITH_SPACE_BETWEEN_LETTERS);
        Assert.assertEquals(SEARCH_EMPTY_MESSAGE, lcp.getMessageEmptySearch());
    }

    @Test
    public void searchCandidateWithSpace () throws InterruptedException {
        lcp.enterPage();
        lcp.searchCandidate(ROGOVA_SURNAME_WITH_SPACE);
        Assert.assertEquals(ROGOVA, lcp.getFirstFindCandidate());
    }

    @Test
    public void filterCandidate () throws InterruptedException {
        lcp.enterPage();
        lcp.clickRelocationAvailable();
        Assert.assertEquals(ROGOVA, lcp.getFirstFindCandidate());
    }

    @Test
    public void negativeFilterCandidate () throws InterruptedException {
        lcp.enterPage();
        Thread.sleep(1000);
        lcp.clickStatusAvailable();
        lcp.clickRelocationAvailable();
        lcp.clickRelocationUnAvailable();
        lcp.clickButtonUniversity();
        lcp.clickUniversityBSU();
        lcp.clickUniversityBSUIR();
        Assert.assertEquals(SEARCH_EMPTY_MESSAGE, lcp.getMessageEmptySearch());
    }

    //не работает
    @Test
    public void checkClearFilter () throws InterruptedException {
        lcp.enterPage();
        Thread.sleep(1000);
        lcp.clickStatusAvailable();
        lcp.clickClearFilter();
        Assert.assertEquals(ROGOVA, lcp.getFirstFindCandidate());
    }

    @Test
    public void typeButtonCreateCandidate () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();
        Assert.assertEquals(CREATE_CANDIDATE_PAGE, driver.getTitle());
    }

    @After
    public void shutDown() {
        driver.close();
        WebDriverSingleton.destroyInstance();
    }

}
