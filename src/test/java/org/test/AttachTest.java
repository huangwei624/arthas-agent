package org.test;

import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;
import org.junit.Test;

import java.io.IOException;

public class AttachTest {


    public static void main(String[] args) throws IOException, AttachNotSupportedException {
        VirtualMachine virtualMachine = VirtualMachine.attach("18987");
//        virtualMachine.loadAgent();

    }

}
