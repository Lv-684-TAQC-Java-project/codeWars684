package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SixTest extends DataProviderUserImpl {

    @DataProvider(name = "findNb")
    public Object[][] findNb() {
        Object[][] data = new Object[][]{
                {4183059834009L, 2022},
                {24723578342962L, -1},
                {135440716410000L, 4824},
                {40539911473216L, 3568},
                {108806345136785L, -1},
                {41364076483082L, -1},
                {9541025211025L, 2485},
                {16, -1}
        };
        return combine(implementationsSixKataDataProvider(), data);
    }

    @Test(dataProvider = "findNb", groups = {"B"})
    public void testFindNb(Six impl, long input, long expected) {
        long actual = impl.findNb(input);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "dpBalance")
    public Object[][] dpBalance() {
        Object[][] param = new Object[][]{
                {"b1", "b1sol"}, {"b2", "b2sol"}};
        return combine(implementationsSixKataDataProvider(), param);
    }

    @Test(dataProvider = "dpBalance")
    public void testBalance(Six impl, String input, String result) {
        assertEquals(impl.balance(input), result);
    }

    @DataProvider(name = "dpApproxFloat")
    public Object[][] dpApproxFloat() {
        Object[][] data = new Object[][]{
                {2.6e-08, 1.29999999155e-08},
                {1.4e-09, 6.999999997549999e-10},
                {5.0e-06, 2.499996875007812e-06},
                {2.4e-07, 1.1999999280000085e-07}
        };
        return combine(implementationsSixKataDataProvider(), data);
    }

    @Test(dataProvider = "dpApproxFloat")
    public void testF(Six impl, double x, double expected) {
        double actual = impl.f(x);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMean() {
    }

    @Test
    public void testVariance() {
    }

    @DataProvider(name = "VolumeOfNbaCupDP")
    public Object[][] VolumeOfNbaCupDP() {
        String resultSheet0 = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101.12 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
                + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
                + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
                + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
                + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
                + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
                + "Atlanta Hawks 94 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 95,";
        String resultSheet1 = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
                + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
                + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
                + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
                + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
                + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
                + "Atlanta Hawks 94 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 95,";
        String resultSheet2 = "San Antonio Spurs 111 Houston Rockets 86,Chicago Bulls 103 Dallas Mavericks 102,Minnesota Timberwolves 112 Milwaukee Bucks 108,"
                + "New Orleans Pelicans 93 Miami Heat 90,Boston Celtics 81 Philadelphia 76ers 65,Detroit Pistons 115 Atlanta Hawks 87,"
                + "Toronto Raptors 92 Washington Wizards 82,Orlando Magic 86 Memphis Grizzlies 76,Los Angeles Clippers 115 Portland Trail Blazers 109,"
                + "Los Angeles Lakers 97 Golden State Warriors 136,Utah Jazz 98 Denver Nuggets 78,Boston Celtics 99 New York Knicks 85,"
                + "Indiana Pacers 98 Charlotte Hornets 86,Dallas Mavericks 87 Phoenix Suns 99,Atlanta Hawks 81 Memphis Grizzlies 82,"
                + "Miami Heat 110 Washington Wizards 105,Detroit Pistons 94 Charlotte Hornets 99,Orlando Magic 110 New Orleans Pelicans 107,"
                + "Los Angeles Clippers 130 Golden State Warriors 95,Utah Jazz 102 Oklahoma City Thunder 113,San Antonio Spurs 84 Phoenix Suns 104,"
                + "Chicago Bulls 103 Indiana Pacers 94,Milwaukee Bucks 106 Minnesota Timberwolves 88,Los Angeles Lakers 104 Portland Trail Blazers 102,"
                + "Houston Rockets 120 New Orleans Pelicans 100,Boston Celtics 111 Brooklyn Nets 105,Charlotte Hornets 94 Chicago Bulls 86,Cleveland Cavaliers 103 Dallas Mavericks 97";
        String teams = "Los Angeles Clippers,Dallas Mavericks,New York Knicks,NYK,Atlanta Hawks,Indiana Pacers,Memphis Grizzlies,"
                + "Los Angeles Lakers,Minnesota Timberwolves,Phoenix Suns,Portland Trail Blazers,New Orleans Pelicans,"
                + "Sacramento Kings,Los Angeles Clippers,Houston Rockets,Denver Nuggets,Cleveland Cavaliers,Milwaukee Bucks,"
                + "Oklahoma City Thunder,San Antonio Spurs,Boston Celtics,Philadelphia 76ers,Brooklyn Nets,Chicago Bulls,"
                + "Detroit Pistons,Utah Jazz,Miami Heat,Charlotte Hornets,Toronto Raptors,Orlando Magic,Washington Wizards,"
                + "Golden State Warriors,Dallas Maver";
        String resultSheet3 = resultSheet1 + resultSheet2;
        String resultSheet4 = resultSheet0 + resultSheet2;
        Object[][] data = new Object[][]{
                {resultSheet3, "Boston Celtics", "Boston Celtics:W=4;D=0;L=0;Scored=403;Conceded=350;Points=12"},
                {resultSheet3, "Boston Celt", "Boston Celt:This team didn't play!"},
                {resultSheet3, "Philadelphia 76ers", "Philadelphia 76ers:W=0;D=0;L=2;Scored=160;Conceded=193;Points=0"},
                {resultSheet4, "New York Knicks", "Error(float number):New York Knicks 101.12 Atlanta Hawks 112"},


        };
        return combine(implementationsSixKataDataProvider(), data);
    }

    @Test(dataProvider = "VolumeOfNbaCupDP")
    public void testNbaCup(Six impl, String resultSheet, String toFind, String expected) {
        Assert.assertEquals(impl.nbaCup(resultSheet, toFind), expected);

    }

    @Test
    public void testStockSummary() {
    }
}