package nl.tudelft.cs4160.trustchain_android.appToAppTest;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.InetSocketAddress;
import java.util.ArrayList;

import nl.tudelft.cs4160.trustchain_android.appToApp.PeerAppToApp;
import nl.tudelft.cs4160.trustchain_android.appToApp.PeerList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Boning on 12/17/2017.
 */

public class PeerListTest {
    private PeerList peerlist;
    private ArrayList<PeerAppToApp> originalIpList;
    private ArrayList<PeerAppToApp> expectedIpList;

    @Before
    public void initialization(){
        PeerAppToApp peer1 = new PeerAppToApp(Mockito.mock(String.class), Mockito.mock(InetSocketAddress.class));
        PeerAppToApp peer2 = new PeerAppToApp(Mockito.mock(String.class), Mockito.mock(InetSocketAddress.class));
        PeerAppToApp peer3 = new PeerAppToApp(Mockito.mock(String.class), Mockito.mock(InetSocketAddress.class));
        originalIpList = new ArrayList<PeerAppToApp>();
        originalIpList.add(peer1);
        originalIpList.add(peer2);
        originalIpList.add(peer3);
        originalIpList.add(peer1);

        peerlist = new PeerList(originalIpList);
    }

    @Test
    public void removeDuplicatesTest(){
        peerlist.removeDuplicates();
        ArrayList<PeerAppToApp> newIPPeerList = peerlist.getPeerList();
        boolean failed = false;

        for (PeerAppToApp peer: newIPPeerList) {
            if(expectedIpList.remove(peer) == false){
                failed = true;
                break;
            }
        }

        if(expectedIpList.size() != 0) failed=false;
        assertFalse(failed);

    }

    @Test
    public void peerExistsInListTest(){
        PeerAppToApp peer4 = new PeerAppToApp(Mockito.mock(String.class), Mockito.mock(InetSocketAddress.class));
        assertTrue(peerlist.peerExistsInList(originalIpList.get(0)));
        assertFalse(peerlist.peerExistsInList(peer4));
    }
}
