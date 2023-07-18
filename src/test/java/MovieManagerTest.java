import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void MovieManagerTest1() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieManagerTest2() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieManagerTest3() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieManagerTestFindLast() {
        MovieManager manager = new MovieManager();


        manager.addMovie("Film 5");

        String[] expected = {"Film 5"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieManagerTestLimit() {
        MovieManager manager = new MovieManager(100);

        int expected = 100;
        int actual = manager.getLimit();
        Assertions.assertEquals(expected, actual);

    }
}