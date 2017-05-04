import com.example.LinkableList;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by harric13 on 5/4/2017.
 */
public class LinkableListTest
{
    /**
     * Interface required
     *
     * isEmpty()
     * add(element)
     * remove(element)
     */

    @Test
    public void testInit(){
        LinkableList list = new LinkableList();
        Assert.assertNotNull(list);
    }

    @Test
    public void testListIsEmotyInitially(){
        LinkableList list = new LinkableList();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testAdditionOfElement(){
        LinkableList list = new LinkableList();
        list.add(1);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testRemovalOfElement(){
        LinkableList list = new LinkableList();
        list.add(1);
        Assert.assertFalse(list.isEmpty());
        list.remove(1);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testMultipleAddition()
    {
        LinkableList list = new LinkableList();
        addTwoElements(list);
        Assert.assertFalse(list.isEmpty());
    }

    private void addTwoElements(final LinkableList list)
    {
        list.add(1);
        list.add(2);
    }

    @Test
    public void testNotEmptyAfterMultipleAddAndOneRemoval(){
        LinkableList list = new LinkableList();
        addTwoElements(list);
        list.remove(1);
        // Improve the error message sent back
        Assert.assertEquals("asdasdasd", false, list.isEmpty());
    }
}
