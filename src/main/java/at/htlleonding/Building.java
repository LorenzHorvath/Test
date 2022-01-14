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

public class Building {
    Integer id;
    String initialResident;

    public Building(Integer id, String initialResident) {
        this.id = id;
        this.initialResident = initialResident;
    }

    public Integer getId() {
        return id;
    }

    public String getInitialResident() {
        return initialResident;
    }
}