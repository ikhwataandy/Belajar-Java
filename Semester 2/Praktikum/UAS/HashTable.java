/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import javax.swing.JOptionPane;

/**
 *
 * @author qoheng
 */
public class HashTable {

    private DataRodaDua[] hashArrayRodaDua;
    private DataRodaEmpat[] hashArrayRodaEmpat;
    private int SizeRodaDua;
    private int SizeRodaEmpat;
    private int NORodaDua;
    private int NORodaEmpat;
    private int nElemenRodaDua;
    private int nElemenRodaEmpat;

    public HashTable(int SizeRodaDua, int SizeRodaEmpat) {
        this.SizeRodaDua = SizeRodaDua;
        this.SizeRodaEmpat = SizeRodaEmpat;
        nElemenRodaDua = 0;
        nElemenRodaEmpat = 0;
        NORodaDua = 0;
        NORodaEmpat = 0;
        hashArrayRodaDua = new DataRodaDua[SizeRodaDua];
        hashArrayRodaEmpat = new DataRodaEmpat[SizeRodaEmpat];
    }

    public void displayTable() {
        System.out.println("+---------------------------------------------------------------------------------------------------------------+");
        System.out.println("|\t\t\t\tData Kendaraan Bermotor Yang Telah Parkir\t\t\t\t\t|");
        System.out.println("+---------------+---------------------------------------+-+---------------+-------------------------------------+");
        System.out.println("|  No Parkir\t|  No Kendaraan dan NO Polisi\t\t| | No Parkir\t  |  No Kendaraan dan NO Polisi\t\t|");
        System.out.println("|\t\t|\tRoda Dua\t\t\t| |\t\t  |\tRoda Empat\t\t\t|");
        System.out.println("+---------------+---------------------------------------+-+---------------+-------------------------------------+");
        int nilai;
        if (SizeRodaDua > SizeRodaEmpat) {
            nilai = SizeRodaDua;
        } else {
            nilai = SizeRodaEmpat;
        }

        for (int i = 0; i < nilai; i++) {

            if (i >= SizeRodaDua) {
                System.out.print("| " + "xx" + "\t\t|  xx \t xx \t\t");
            } else {
                if (hashArrayRodaDua[i] != null) {
                    System.out.print("| " + i + "\t\t|  " + hashArrayRodaDua[i].getNO() + "\t" + hashArrayRodaDua[i].getPlat() + "\t");
                } else {
                    System.out.print("| " + i + "\t\t|  -- \t-- \t\t");
                }
            }

            if (i >= SizeRodaEmpat) {
                System.out.println("\t\t| | " + "xx" + "\t\t  | xx \t xx \t\t\t\t|");
            } else {
                if (hashArrayRodaEmpat[i] != null) {
                    System.out.println("\t\t| | " + i + "\t\t  | " + hashArrayRodaEmpat[i].getNO() + "\t" + hashArrayRodaEmpat[i].getPlat() + " \t\t\t|");
                } else {
                    System.out.println("\t\t| | " + i + "\t\t  | -- \t-- \t\t\t\t|");
                }
            }
        }

        System.out.println("+---------------+---------------------------------------+-+---------------+-------------------------------------+");
        System.out.println("Jumlah Roda Dua = " + nElemenRodaDua);
        System.out.println("Jumlah Roda Empat = " + nElemenRodaEmpat);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }

    public int hashFunctionRodaDua(int key) {
        return key % SizeRodaDua;
    }

    public int hashFunctionRodaEmpat(int key) {
        return key % SizeRodaEmpat;
    }

    public void insertRodaDua() {

        if (nElemenRodaDua == SizeRodaDua) {
            JOptionPane.showMessageDialog(null, "Maaf, Tempat Parkir Roda Dua Penuh");
        } else {
            String Plat = JOptionPane.showInputDialog(null, "Masukkan NO Polisi Parkir Roda Dua");
            DataRodaDua item = new DataRodaDua(NORodaDua, Plat);
            NORodaDua++;
            int key = item.getNO();
            int hashVal = hashFunctionRodaDua(key);
            while (hashArrayRodaDua[hashVal] != null) {
                ++hashVal;
                hashVal %= SizeRodaDua;
            }

            hashArrayRodaDua[hashVal] = item;
            JOptionPane.showMessageDialog(null, "Kendaraan Roda Dua " + Plat + " Silahkan Parkir di NO " + hashVal);
            nElemenRodaDua++;

        }

    }

    public void insertRodaEmpat() {

        if (nElemenRodaEmpat == SizeRodaEmpat) {
            JOptionPane.showMessageDialog(null, "Maaf, Tempat Parkir Roda Empat Penuh");
        } else {
            String Plat = JOptionPane.showInputDialog(null, "Masukkan NO Polisi Parkir Roda Empat");
            DataRodaEmpat item = new DataRodaEmpat(NORodaEmpat, Plat);
            NORodaEmpat++;
            int key = item.getNO();
            int hashVal = hashFunctionRodaDua(key);
            while (hashArrayRodaEmpat[hashVal] != null) {
                ++hashVal;
                hashVal %= SizeRodaEmpat;
            }

            hashArrayRodaEmpat[hashVal] = item;
            JOptionPane.showMessageDialog(null, "Kendaraan Roda Empat " + Plat + " Silahkan Parkir di NO " + hashVal);
            nElemenRodaEmpat++;
        }

    }

    public DataRodaDua deleteNORodaDua(int NO) {
        int hashVal = hashFunctionRodaDua(NO);
        while (hashArrayRodaDua[hashVal] != null) {
            if (hashArrayRodaDua[hashVal].getNO() == NO) {
                DataRodaDua temp = hashArrayRodaDua[hashVal];
                String Plat = hashArrayRodaDua[hashVal].getPlat();
                JOptionPane.showMessageDialog(null, "Kendaraan Roda Dua " + Plat + " Telah meinggalkan Parkir");
                hashArrayRodaDua[hashVal] = null;
                nElemenRodaDua--;
                return temp;
            }
            ++hashVal;
            hashVal %= SizeRodaDua;
        }
        JOptionPane.showMessageDialog(null, "NO Kendaraan Roda Dua " + NO + " Tidak Tersedia");
        return null;

    }

    public DataRodaDua deletePlatRodaDua(String Plat) {
        for (int i = 0; i < SizeRodaDua; i++) {
            if (hashArrayRodaDua[i] != null) {
                if (hashArrayRodaDua[i].getPlat().equals(Plat)) {
                    hashArrayRodaDua[i] = null;
                    nElemenRodaDua--;
                    JOptionPane.showMessageDialog(null, "NO POlisi Roda Dua " + Plat + " Berhasil Meninggalkan Parkir");
                    return hashArrayRodaDua[i];

                }
            } else if (i == SizeRodaDua - 1) {
                JOptionPane.showMessageDialog(null, "NO Polisi Roda Dua " + Plat + " Tidak Tersedia");
                return null;
            }

        }
        return null;
    }

    public DataRodaEmpat deleteNORodaEmpat(int NO) {
        int hashVal = hashFunctionRodaEmpat(NO);
        while (hashArrayRodaEmpat[hashVal] != null) {
            if (hashArrayRodaEmpat[hashVal].getNO() == NO) {
                DataRodaEmpat temp = hashArrayRodaEmpat[hashVal];
                String Plat = hashArrayRodaEmpat[hashVal].getPlat();
                JOptionPane.showMessageDialog(null, "Kendaraan Roda Empat " + Plat + " Telah meinggalkan Parkir");
                hashArrayRodaEmpat[hashVal] = null;
                nElemenRodaEmpat--;
                return temp;
            }
            ++hashVal;
            hashVal %= SizeRodaEmpat;
        }
        JOptionPane.showMessageDialog(null, "NO Kendaraan Roda Empat " + NO + " Tidak Tersedia");
        return null;
    }

    public DataRodaEmpat deletePlatRodaEmpat(String Plat) {
        for (int i = 0; i < SizeRodaEmpat; i++) {
            if (hashArrayRodaEmpat[i] != null) {
                if (hashArrayRodaEmpat[i].getPlat().equals(Plat)) {
                    hashArrayRodaEmpat[i] = null;
                    nElemenRodaEmpat--;
                    JOptionPane.showMessageDialog(null, "NO POlisi Roda Empat " + Plat + " Berhasil Meninggalkan Parkir");
                    return hashArrayRodaEmpat[i];

                }
            } else if (i == SizeRodaEmpat - 1) {
                JOptionPane.showMessageDialog(null, "NO Polisi Roda Empat " + Plat + " Tidak Tersedia");
                return null;
            }

        }
        return null;
    }

    public DataRodaDua findNORodaDua(int NO) {

        int hashVal = hashFunctionRodaDua(NO);
        while (hashArrayRodaDua[hashVal] != null) {
            if (hashArrayRodaDua[hashVal].getNO() == NO) {
                String Plat = hashArrayRodaDua[hashVal].getPlat();
                JOptionPane.showMessageDialog(null, "Kendaraan Roda Dua\nNO Parkir : " + hashVal + "\nNO Kendaraan : " + NO + "\nNO Polisi : " + Plat);
                return hashArrayRodaDua[hashVal];
            }
            ++hashVal;
            hashVal %= SizeRodaDua;
        }
        JOptionPane.showMessageDialog(null, "NO Kendaraan Roda Dua " + NO + " Tidak Di Temuakan");
        return null;
    }

    public DataRodaDua findPlatRodaDua(String Plat) {
        for (int i = 0; i < SizeRodaDua; i++) {
            if (hashArrayRodaDua[i] != null) {
                if (hashArrayRodaDua[i].getPlat().equals(Plat)) {
                    int NO = hashArrayRodaDua[i].getNO();
                    JOptionPane.showMessageDialog(null, "Kendaraan Roda Dua\nNO Parkir : " + i + "\nNO Kendaraan : " + NO + "\nNO Polisi : " + Plat);
                    return hashArrayRodaDua[i];

                }
            } else if (i == SizeRodaDua - 1) {
                JOptionPane.showMessageDialog(null, "NO Polisi Roda Dua " + Plat + " Tidak Tersedia");
                return null;
            }

        }
        return null;
    }

    public DataRodaEmpat findNORodaEmpat(int NO) {
        int hashVal = hashFunctionRodaEmpat(NO);
        while (hashArrayRodaEmpat[hashVal] != null) {
            if (hashArrayRodaEmpat[hashVal].getNO() == NO) {
                String Plat = hashArrayRodaEmpat[hashVal].getPlat();
                JOptionPane.showMessageDialog(null, "Kendaraan Roda Empat\nNO Parkir : " + hashVal + "\nNO Kendaraan : " + NO + "\nNO Polisi : " + Plat);
                return hashArrayRodaEmpat[hashVal];
            }
            ++hashVal;
            hashVal %= SizeRodaEmpat;
        }
        JOptionPane.showMessageDialog(null, "NO Kendaraan Roda Empat " + NO + " Tidak Di Temuakan");
        return null;
    }

    public DataRodaEmpat findPlatRodaEmpat(String Plat) {

        for (int i = 0; i < SizeRodaEmpat; i++) {
            if (hashArrayRodaEmpat[i] != null) {
                if (hashArrayRodaEmpat[i].getPlat().equals(Plat)) {
                    int NO = hashArrayRodaEmpat[i].getNO();
                    JOptionPane.showMessageDialog(null, "Kendaraan Roda Empat\nNO Parkir : " + i + "\nNO Kendaraan : " + NO + "\nNO Polisi : " + Plat);
                    return hashArrayRodaEmpat[i];

                }
            } else if (i == SizeRodaEmpat - 1) {
                JOptionPane.showMessageDialog(null, "NO Polisi Roda Empat " + Plat + " Tidak Tersedia");
                return null;
            }

        }
        return null;
    }

    public DataRodaDua updateRodaDua(int NO) {

        int hashVal = hashFunctionRodaDua(NO);
        while (hashArrayRodaDua[hashVal] != null) {
            if (hashArrayRodaDua[hashVal].getNO() == NO) {
                String input = JOptionPane.showInputDialog(null, "Masukkan Ulang NO Polisi Kendaraan");
                DataRodaDua item = new DataRodaDua(NO, input);
                hashArrayRodaDua[hashVal] = item;
                JOptionPane.showMessageDialog(null, "Data Berhasil di Perbarui");
                return hashArrayRodaDua[hashVal];
            }
            ++hashVal;
            hashVal %= SizeRodaDua;
        }
        JOptionPane.showMessageDialog(null, "NO Kendaraan Roda Dua " + NO + " Tidak Di Temuakan");
        return null;

    }

    public DataRodaEmpat updateRodaEmpat(int NO) {

        int hashVal = hashFunctionRodaDua(NO);
        while (hashArrayRodaEmpat[hashVal] != null) {
            if (hashArrayRodaEmpat[hashVal].getNO() == NO) {
                String input = JOptionPane.showInputDialog(null, "Masukkan Ulang NO POlisi Kendaraan");
                DataRodaEmpat item = new DataRodaEmpat(NO, input);
                hashArrayRodaEmpat[hashVal] = item;
                JOptionPane.showMessageDialog(null, "Data Berhasil di Perbarui");
                return hashArrayRodaEmpat[hashVal];
            }
            ++hashVal;
            hashVal %= SizeRodaEmpat;
        }
        JOptionPane.showMessageDialog(null, "NO Kendaraan Roda Empat " + NO + " Tidak Di Temuakan");
        return null;

    }
}
