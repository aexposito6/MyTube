
import java.rmi.*;
import java.io.*;
import java.util.List;
import java.util.Vector;

//Interface of the server's implementation
public interface MyTubeInterface extends Remote {

    public byte[] download(String name, boolean repeat)
            throws java.rmi.RemoteException;

    public void upload(byte[] file, String title)
            throws java.rmi.RemoteException;

    public String find(String name, boolean repeat)
            throws java.rmi.RemoteException;

    public void addCallback(
            CallbackInterface CallbackObject)
            throws java.rmi.RemoteException;

    public void unregisterForCallback(
            CallbackInterface callbackClientObject)
            throws java.rmi.RemoteException;

    public Vector addServerAll(
            MyTubeInterface MyTubeServer)
            throws java.rmi.RemoteException;
}
