package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        UserList ul = new UserList();

        // TODO: add 3 users to UserList
        ul.addUser("John", "123");
        ul.addUser("F", "456");
        ul.addUser("Kennedy", "789");

        // TODO: find one of them
        User u1 = ul.findUserByUsername("John");

        // TODO: assert that UserList found User
         String actual = u1.getUsername();
         assertEquals("John", actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        UserList ul = new UserList();

        // TODO: add 3 users to UserList
        ul.addUser("John", "123");
        ul.addUser("F", "456");
        ul.addUser("Kennedy", "789");

        // TODO: change password of one user
        boolean actual = ul.changePassword("John", "123", "abc");

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        UserList ul = new UserList();

        // TODO: add 3 users to UserList
        ul.addUser("John", "123");
        ul.addUser("F", "456");
        ul.addUser("Kennedy", "789");

        // TODO: call login() with correct username and password
        User u1 = ul.login("F", "456");

        // TODO: assert that User object is found
        User expected = ul.findUserByUsername("F");
        assertEquals(expected, u1);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        UserList ul = new UserList();

        // TODO: add 3 users to UserList
        ul.addUser("John", "123");
        ul.addUser("F", "456");
        ul.addUser("Kennedy", "789");

        // TODO: call login() with incorrect username or incorrect password
        User u1 = ul.login("Kennedy", "798");

        // TODO: assert that the method return null
        assertNull(u1);
    }

}