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

    public Building(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getInitialResident() {
        return initialResident;
    }
}