package sample;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

import java.io.IOException;
import java.util.prefs.Preferences;

public class ConApp {
    private final Runtime r = Runtime.getRuntime();
    private final Preferences prefs = Preferences.userNodeForPackage(Main.class);
    private final String defaultValue = "default string";
    private final String PREF_NAME = "pass";
    private final String propertyValue = prefs.get(PREF_NAME, defaultValue);
    @FXML
    CheckBox cbHs;

    public void btnUnrarA() {
        String myScript = "echo " + propertyValue + " | sudo -S apt-get -y install unrar && sudo apt-get update";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

//        try {
//            r.exec(cmdArray).waitFor();
//        } catch (InterruptedException | IOException e) {
//            e.printStackTrace();
//        }
        execRuntime(cmdArray, cmdArray2);
    }

    private void execRuntime(String[] cmdArray, String[] cmdArray2) {
        try {
            if (cbHs.isSelected()) {
                r.exec(cmdArray).waitFor();
            } else {
                r.exec(cmdArray2).waitFor();
            }
        } catch (InterruptedException | IOException e1) {
            e1.printStackTrace();
        }
    }

    public void btnUCleanerA() {
        String myScript = "echo " + propertyValue + " | sudo -S add-apt-repository -y ppa:gerardpuig/ppa " +
                "&& sudo apt-get -y update && sudo apt-get -y install ubuntu-cleaner";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }

    public void btnNVidiaA() {
        String myScript = "echo " + propertyValue + " | sudo -S add-apt-repository -y ppa:graphics-drivers/ppa " +
                "&& sudo apt-get -y update";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }

    public void btnConverseenA() {
        String myScript = "echo " + propertyValue + " | sudo -S add-apt-repository -y ppa:ubuntuhandbook1/apps " +
                "&& sudo apt-get -y update && sudo apt-get -y install converseen";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }

    public void btnJava9A() {
        String myScript = "echo " + propertyValue + " | sudo -S add-apt-repository -y ppa:webupd8team/java " +
                "&& sudo apt-get -y update && sudo apt-get -y install oracle-java9-installer";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }

    public void ntnJava8A() {
        String myScript = "echo " + propertyValue + " | sudo -S add-apt-repository -y ppa:webupd8team/java " +
                "&& sudo apt-get -y update && sudo apt-get -y install oracle-java8-installer";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }

    public void btnWinFFA() {
        String myScript = "echo " + propertyValue + " | sudo -S apt-get -y install winff && sudo apt-get update";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }

    public void btnMPVA() {
        String myScript = "echo " + propertyValue + " | sudo -S add-apt-repository -y ppa:mc3man/mpv-tests " +
                "&& sudo apt-get -y update && sudo apt-get -y install mpv";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }

    public void btnMediaInfoA() {
        String myScript = "echo " + propertyValue + " | sudo -S apt-get -y install mediainfo-gui && sudo apt-get update";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }

    public void btnTimeshift() {
        String myScript = "echo " + propertyValue + " | sudo -S apt-add-repository -y ppa:teejee2008/ppa " +
                "&& sudo apt-get -y update && sudo apt-get -y install timeshift";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }


    public void btnTrashCliInstall() {
        String myScript = "echo " + propertyValue + " | sudo -S apt-get -y install trash-cli && sudo apt-get update";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }

    public void btnTrashEmpty() {
        String myScript = "echo " + propertyValue + " | sudo -S trash-empty";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }

    public void btnSMPlayer() {
        String myScript = "echo " + propertyValue + " | sudo -S add-apt-repository ppa:rvm/smplayer " +
                "&& sudo apt-get -y update && sudo apt-get -y install smplayer smplayer-themes smplayer-skins";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }

    public void btnSMPlayer2() {
        String myScript = "echo " + propertyValue + " | sudo -S sh -c \"echo 'deb http://download.opensuse.org/" +
                "repositories/home:/smplayerdev/xUbuntu_17.10/ /' > /etc/apt/sources.list.d/smplayer.list\" " +
                "&& wget -nv https://download.opensuse.org/repositories/home:smplayerdev/xUbuntu_17.10/" +
                "Release.key -O Release.key && sudo apt-key add - < Release.key && sudo apt-get -y update " +
                "&& sudo apt-get -y install smplayer ";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }

    public void btnAlbert() {
        String myScript = "echo " + propertyValue + " | sudo -S sh -c \"echo 'deb http://download.opensuse.org/" +
                "repositories/home:/manuelschneid3r/xUbuntu_16.04/ /' > /etc/apt/sources.list.d/albert.list\" " +
                "wget -nv https://download.opensuse.org/repositories/home:manuelschneid3r/xUbuntu_16.04/" +
                "Release.key -O Release.key && sudo apt-key add - < Release.key" +
                "&& sudo apt-get -y update && sudo apt-get -y install albert";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }

    public void btnAlbert2() {
        String myScript = "echo " + propertyValue + " | sudo -S sh -c \"echo 'deb http://download.opensuse.org/" +
                "repositories/home:/manuelschneid3r/xUbuntu_17.10/ /' > /etc/apt/sources.list.d/albert.list\" " +
                "&& wget -nv https://download.opensuse.org/repositories/home:manuelschneid3r/xUbuntu_17.10/" +
                "Release.key -O Release.key && sudo apt-key add - < Release.key && sudo apt-get -y update " +
                "&& sudo apt-get -y install albert ";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execRuntime(cmdArray, cmdArray2);
    }
}

//    For xUbuntu 17.10 run the following:  Albert
//
//        sudo sh -c "echo 'deb http://download.opensuse.org/repositories/home:/manuelschneid3r/xUbuntu_17.10/ /' > /etc/apt/sources.list.d/albert.list"
//        sudo apt-get update
//        sudo apt-get install albert
//        You can add the repository key to apt. Keep in mind that the owner of the key may distribute updates, packages and repositories that your system will trust (more information). To add the key, run:
//
//        wget -nv https://download.opensuse.org/repositories/home:manuelschneid3r/xUbuntu_17.10/Release.key -O Release.key
//        sudo apt-key add - < Release.key
//        sudo apt-get update


//
//    For xUbuntu 17.10 run the following:  SmPlayer
//
//        sudo sh -c "echo 'deb http://download.opensuse.org/repositories/home:/smplayerdev/xUbuntu_17.10/ /' > /etc/apt/sources.list.d/smplayer.list"
//        sudo apt-get update
//        sudo apt-get install smplayer
//        You can add the repository key to apt. Keep in mind that the owner of the key may distribute updates, packages and repositories that your system will trust (more information). To add the key, run:
//
//        wget -nv https://download.opensuse.org/repositories/home:smplayerdev/xUbuntu_17.10/Release.key -O Release.key
//        sudo apt-key add - < Release.key
//        sudo apt-get update


//    sudo add-apt-repository ppa:rvm/smplayer
//        sudo apt-get update
//        sudo apt-get install smplayer smplayer-themes smplayer-skins
//
//    sudo apt install trash-cli
//        Once installed you can do
//
//        sudo trash-empty

///     sudo sh -c "echo 'deb http://download.opensuse.org/repositories/home:/manuelschneid3r/xUbuntu_16.04/ /' > /etc/apt/sources.list.d/albert.list"
//        sudo apt-get update
//        sudo apt-get install albert
////
//
//        ln -s /usr/share/applications/albert.desktop ~/.config/autostart/


//    sudo apt-add-repository -y ppa:teejee2008/ppa
//        sudo apt-get update
//        sudo apt-get install timeshift

//    sudo add-apt-repository ppa:thefanclub/ubuntu-after-install
//        sudo apt-get update
//        sudo apt-get install ubuntu-after-install


//apt-get install mediainfo-gui

//    sudo add-apt-repository ppa:mc3man/mpv-tests
//
//        sudo apt update && sudo apt install mpv


//    sudo apt-get update
//        Install WinFF by running the following command:
//
//        sudo apt-get install winff


//    sudo add-apt-repository ppa:webupd8team/java
//        $ sudo apt-get update
//        $ sudo apt-get install oracle-java8-installer

//    sudo add-apt-repository ppa:webupd8team/java
//        sudo apt-get update
//        sudo apt-get install oracle-java9-installer

//    $ sudo add-apt-repository ppa:ubuntuhandbook1/apps
//        $ sudo apt-get update
//        $ sudo apt-get install converseen

//    sudo add-apt-repository ppa:graphics-drivers/ppa
//        sudo apt-get update

//    o install Ubuntu Cleaner in Ubuntu , add the following PPA:
//        sudo add-apt-repository ppa:gerardpuig/ppa
//        Update the repository list using command:
//        sudo apt-get update
//        Then, install Ubuntu Cleaner as shown below.
//        sudo apt-get install ubuntu-cleaner

//    sudo add-apt-repository -y ppa:tualatrix/ppa
//
//
//        sudo apt-get -y update

//        sudo apt-get -y install \
//        nautilus-dropbox \