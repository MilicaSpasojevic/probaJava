/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.communication;

import java.io.Serializable;

/**
 *
 * @author Cartman
 */
public enum Operation  implements Serializable{
    LOGIN,
    GET_ALL_MANUFACTURERS,
    GET_ALL_PRODUCTS,
    ADD_PRODUCT,
    EDIT_PRODUCT,
    DELETE_PRODUCT,
    ADD_INVOICE
}
