package nl.tudelft.cs4160.trustchain_android.GUITest;

import android.content.Intent;
import android.provider.Telephony;
import android.widget.Button;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowApplication;

import nl.tudelft.cs4160.trustchain_android.BuildConfig;
import nl.tudelft.cs4160.trustchain_android.R;
import nl.tudelft.cs4160.trustchain_android.inbox.InboxActivity;
import nl.tudelft.cs4160.trustchain_android.main.OverviewConnectionsActivity;
import nl.tudelft.cs4160.trustchain_android.main.UserConfigurationActivity;

import static junit.framework.Assert.assertEquals;

//
///**
// * Created by Laurens on 12/18/2017.
// */
//
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 25)
public class IntegrationGuiTest {


    @Test
    public void testInboxOverviewActivity() {
//            InboxActivity inboxActivity = Robolectric.setupActivity(InboxActivity.class);
//            Button findNewUserButton = (Button) inboxActivity.findViewById(R.id.userButton);
//            findNewUserButton.callOnClick();
//
//            Intent expectedIntent = new Intent(inboxActivity, OverviewConnectionsActivity.class);
//            Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
//            Object ob = expectedIntent.getComponent();
//            Object ob2 = actual.getComponent();
//            assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

//
//    private String userName = "testUser";
//
//    @Rule
//    public ActivityTestRule<UserConfigurationActivity> mActivityRule = new ActivityTestRule<>(
//            UserConfigurationActivity.class);
//
//    @Before
//    public void createPeer() {
//        emptyUserNamePreferences();
//        mActivityRule.launchActivity(new Intent());
//        //enter the username
//        onView(withId(R.id.username)).perform(replaceText(userName));
//        // press the login button
//        onView(withId(R.id.confirm_button)).perform(click());
//    }
//
//    private void emptyUserNamePreferences(){
//        // Check whether it is empty
//        // If not, put null in it
//        if(UserNameStorage.getUserName(getInstrumentation().getTargetContext()) != null) {
//            UserNameStorage.setUserName(getInstrumentation().getTargetContext(), null);
//        }
//    }
//
//    @Test
//    public void testOverviewConnectionsActivity() {
//        // Checks if the local IP is right
//        //onView(allOf(withId(R.id.local_ip_address_view), withText(Network.getInstance(getInstrumentation().getTargetContext()).getInternalSourceAddress().getAddress().toString()))).check(matches(isDisplayed()));
//        // Checks if the name of the peer matches
//        onView(allOf(withId(R.id.peer_id), withText(UserNameStorage.getUserName(getInstrumentation().getTargetContext())))).check(matches(isDisplayed()));
//        // Checks if the connection type is the right one
//        //onView(allOf(withId(R.id.connection_type), withText("WIFI"))).check(matches(isDisplayed()));
//    }
//

////    @Test
////    public void checkInitialChain(){
////        // Open menu
////        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
////        // Click on the menu item
////        onView(withText("My Chain")).perform(click());
////        // Show the chain on the screen.
////        onView(withId(R.id.blocks_list)).check(matches(isDisplayed()));
////        // Expand the genesis block in the list
////        onData(anything()).inAdapterView(withId(R.id.blocks_list)).atPosition(0).perform(click());
////        // Genesis block has no linked pub key, so it should be 00
////        onView(allOf(withId(R.id.link_pub_key), withText("00"))).check(matches(isDisplayed()));
////        // Genesis block has no previous hash, so it should be 00
////        onView(allOf(withId(R.id.prev_hash), withText("00"))).check(matches(isDisplayed()));
////        // The genesis block doesn't contain any transactions
////        onView(allOf(withId(R.id.transaction), withText(""))).check(matches(isDisplayed()));
////        // The pub key of the genesis block should be equal to the users pub key
////        onView(allOf(withId(R.id.pub_key), withText(ByteArrayConverter.bytesToHexString(getGenesisBlock().getPublicKey().toByteArray())))).check(matches(isDisplayed()));
////        // The signature should be the block signed with the users private key
////        onView(allOf(withId(R.id.signature), withText(ByteArrayConverter.bytesToHexString(getGenesisBlock().getSignature().toByteArray())))).check(matches(isDisplayed()));
////    }
//
////    @Test
////    public void checkInformationActivity() {
////        // Open menu
////        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
////        // Click on the menu item
////        onView(withText("Info")).perform(click());
////        onView(allOf(withId(R.id.connectionInfoHeaderText), withText(R.string.connectionInfoText))).check(matches(isDisplayed()));
////    }
//
//    @Test
//    public void checkFindPeerActivity() {
//        // Open menu
//        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
//        // Click on the menu item
//        onView(withText("Find peer")).perform(click());
//        onView(withId(R.id.change_bootstrap)).check(matches(isDisplayed()));
//    }
//
//    public MessageProto.TrustChainBlock getGenesisBlock() {
//        TrustChainDBHelper dbHelper = new TrustChainDBHelper(getInstrumentation().getTargetContext());
//        KeyPair kp = Key.loadKeys(getInstrumentation().getTargetContext());
//        byte[] publicKey = kp.getPublic().getEncoded();
//        return dbHelper.getBlocks(publicKey, true).get(0);
//    }
}
