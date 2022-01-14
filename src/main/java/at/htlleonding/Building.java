/*----------------------------------------------------------
 *                HTBLA-Leonding / Class: 3CHIF
 * ---------------------------------------------------------
 * Title: Test
 * Author: Lorenz Horvath
 * ----------------------------------------------------------
 * Description:
 * Implementation of Building
 * ----------------------------------------------------------
 */
package at.htlleonding;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Building {
    Integer id;
    String initialResident;
    String[] initialResidents;
    public List<String> residents = new LinkedList<>();

    public Building(Integer id, String initialResident) {
        this.id = id;
        this.initialResident = initialResident;
        residents.add(initialResident);
    }

    public Building(Integer id, String[] initialResidents) {
        this.id = id;
        this.initialResidents = initialResidents;
        Collections.addAll(residents, initialResidents);
    }

    public Integer getId() {
        return id;
    }

    public String getInitialResident() {
        return initialResident;
    }

    public String[] getInitialResidents() {
        return initialResidents;
    }

    public List<String> getResidents() {
        return residents;
    }
}