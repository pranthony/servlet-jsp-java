/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.lpii_second;

import javax.ejb.Stateless;

/**
 *
 * @author prantony
 */
@Stateless
public class DataBeen {
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private short tr1, tr2, tr3, tr4, tr5;
    private short inv1, inv2;//investigacion 02
    private short exm1, exm2, exm3, exm4, exm5;//examenes parciales 05
    private short prt1, prt2, prt3, prt4, prt5;//participaciones 05
    private short efnl;//examen final 01
    private double tr_promedio, inv_promedio, exm_promedio, prt_promedio, promedio_final;
    
    
    
    public DataBeen() {
        
    }

    public short getTr1() {
        if (isValidNota(tr1)){
        return tr1;
        }
        return -1;
    }

    public short getTr2() {
        if (isValidNota(tr2)){
        return tr2;
        }
        return -1;
    }

    public short getTr3() {
        if (isValidNota(tr3)){
        return tr3;
        }
        return -1;
    }

    public short getTr4() {
        if (isValidNota(tr4)){
        return tr4;
        }
        return -1;
    }

    public short getTr5() {
        if (isValidNota(tr5)){
        return tr5;
        }
        return -1;
    }

    public short getInv1() {
        if (isValidNota(inv1)){
        return inv1;
        }
        return -1;
    }

    public short getInv2() {
        if (isValidNota(inv2)){
        return inv2;
        }
        return -1;
    }

    public short getExm1() {
        if (isValidNota(exm1)){
        return exm1;
        }
        return -1;
    }

    public short getExm2() {
        if (isValidNota(exm2)){
        return exm2;
        }
        return -1;
    }

    public short getExm3() {
        if (isValidNota(exm3)){
        return exm3;
        }
        return -1;
    }

    public short getExm4() {
        if (isValidNota(exm4)){
        return exm4;
        }
        return -1;
    }

    public short getExm5() {
        if (isValidNota(exm5)){
        return exm5;
        }
        return -1;
    }

    public short getPrt1() {
        if (isValidNota(prt1)){
        return prt1;
        }
        return -1;
    }

    public short getPrt2() {
        if (isValidNota(prt2)){
        return prt2;
        }
        return -1;
    }

    public short getPrt3() {
        if (isValidNota(prt3)){
        return prt3;
        }
        return -1;
    }

    public short getPrt4() {
        if (isValidNota(prt4)){
        return prt4;
        }
        return -1;
    }

    public short getPrt5() {
        if (isValidNota(prt5)){
        return prt5;
        }
        return -1;
    }

    public short getEfnl() {
        if (isValidNota(efnl)){
        return efnl;
        }
        return -1;
    }

    public void setTr1(String tr1) {
        this.tr1 = Short.valueOf(tr1);
    }

    public void setTr2(String tr2) {
        this.tr2 = Short.valueOf(tr2);
    }

    public void setTr3(String tr3) {
        this.tr3 = Short.valueOf(tr3);
    }

    public void setTr4(String tr4) {
        this.tr4 = Short.valueOf(tr4);
    }

    public void setTr5(String tr5) {
        this.tr5 = Short.valueOf(tr5);
    }

    public void setInv1(String inv1) {
        this.inv1 = Short.valueOf(inv1);
    }

    public void setInv2(String inv2) {
        this.inv2 = Short.valueOf(inv2);
    }

    public void setExm1(String exm1) {
        this.exm1 = Short.valueOf(exm1);
    }

    public void setExm2(String exm2) {
        this.exm2 = Short.valueOf(exm2);
    }

    public void setExm3(String exm3) {
        this.exm3 = Short.valueOf(exm3);
    }

    public void setExm4(String exm4) {
        this.exm4 = Short.valueOf(exm4);
    }

    public void setExm5(String exm5) {
        this.exm5 = Short.valueOf(exm5);
    }

    public void setPrt1(String prt1) {
        this.prt1 = Short.valueOf(prt1);
    }

    public void setPrt2(String prt2) {
        this.prt2 = Short.valueOf(prt2);
    }

    public void setPrt3(String prt3) {
        this.prt3 = Short.valueOf(prt3);
    }

    public void setPrt4(String prt4) {
        this.prt4 = Short.valueOf(prt4);
    }

    public void setPrt5(String prt5) {
        this.prt5 = Short.valueOf(prt5);
    }

    public void setEfnl(String efnl) {
        this.efnl = Short.valueOf(efnl);
    }
    
    private boolean isValidNota(short nota){
        return nota >= 0 && nota <=20;
    }

    public double getTr_promedio() {
        this.tr_promedio = (this.tr1 + this.tr2 + this.tr3 + this.tr4 + this.tr5)/5;
        return tr_promedio;
    }

    public double getInv_promedio() {
        this.inv_promedio = (this.inv1 + this.inv2)/2;
        return inv_promedio;
    }

    public double getExm_promedio() {
        this.exm_promedio = (this.exm1 + this.exm2 + this.exm3+ this.exm4 + this.exm5)/5;
        return exm_promedio;
    }

    public double getPrt_promedio() {
        this.prt_promedio = (this.prt1 + this.prt2 + this.prt3 + this.prt4 + this.prt5)/5;
        return prt_promedio;
    }

    public double getPromedio_final() {
        this.promedio_final = (this.tr_promedio*0.2)+(this.inv_promedio*0.2)+(this.exm_promedio*0.2)+(this.prt_promedio*0.1)+(this.efnl*0.3);
        return promedio_final;
    }
    
}
