
package practicalab;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class PracticaLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona obPer = new Persona();
        obPer.leer();
        obPer.mostrar();
        Alumno obAl = new Alumno ();
        obAl.leer();
        obAl.leerAlumno();
        obAl.mostrar();
        Empleado obEm = new Empleado ();
        obEm.leer();
        obEm.leerEmpleado();
        obEm.mostrar();
        Administrativo obAd = new Administrativo();
        obAd.leer();
        obAd.leerAdministrativo();
        obAd.mostrar();
        Docente obDoc = new Docente();
        obDoc.leer();
        obDoc.leerDocente();
        obDoc.mostrar();
        Cantante obCan = new Cantante();
        obCan.leer();
        obCan.leerCantante();
        obCan.mostrar();
    }
    
}
class Persona {
    int edad;
    String nombre,genero;
    
    void leer(){
        nombre=JOptionPane.showInputDialog("Digite el nombre");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
        genero=JOptionPane.showInputDialog("Digite el genero (Masculino/Femenino)");
    }
    void mostrar(){
        JOptionPane.showMessageDialog(null,"\nEl nombre es: " +nombre+"\nedad: "+edad+"\ngenero: "+genero);
    }
}
class Alumno extends Persona {
    int semestre;
    String especialidad,numControl;
    
    void leerAlumno(){
        semestre=Integer.parseInt(JOptionPane.showInputDialog("Digite el semestre del alumno"));
        especialidad=JOptionPane.showInputDialog("Digite la especialidad del alumno");
        numControl=JOptionPane.showInputDialog("Digite el numero de control");
    }
    void mostrar (){
        JOptionPane.showMessageDialog(null,"\nEl nombre es: " + nombre +"\nedad: "+edad+"\ngenero: "+genero+"\nSemestre :"+semestre+"\nespecialidad: "+especialidad+"\nNumero de control: "+numControl);
    }
}
class Empleado extends Persona {
    int horas,clavePlaza;
    String rfc;
    
    void leerEmpleado (){
     horas=Integer.parseInt(JOptionPane.showInputDialog("Digite las horas del empleado"));
     clavePlaza=Integer.parseInt(JOptionPane.showInputDialog("Digite la clave plaza del empleado"));
     rfc=JOptionPane.showInputDialog("Digite el RFC del empleado");
    }
    void mostrar (){
     JOptionPane.showMessageDialog(null,"\nEl nombre es: " + nombre +"\nedad: "+edad+"\ngenero: "+genero+"\nHoras trabajadas :" +horas+ "\nClave de la plaza: " +clavePlaza+ "\nRFC: "+rfc);
    }
}
class Administrativo extends Empleado {
    String actividad,depto;
    
    void leerAdministrativo (){
     depto=JOptionPane.showInputDialog("Digite el departamento");
     actividad=JOptionPane.showInputDialog("Digite su actividad");
    }
    void mostrar (){
     JOptionPane.showMessageDialog(null,"\nEl nombre es: " + nombre +"\nedad: "+edad+"\ngenero: "+genero+"\nDepartamento :" +depto+ "\nActividad: " +actividad);
    }
}
class Docente extends Empleado {
    int numMaterias;
    String carrera,grado;
    
    void leerDocente (){
        numMaterias=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Materias que lleva"));
        carrera=JOptionPane.showInputDialog("Digite la carrera");
        grado=JOptionPane.showInputDialog("Digite el grado");    
    }
    void mostrar (){
        JOptionPane.showMessageDialog(null,"\nEl nombre es: " + nombre +"\nedad: "+edad+"\ngenero: "+genero+"\nNumero de materias:" +numMaterias+ "\nCarrera: " +carrera+ "\nGrado: " +grado);
    }
}
class Cantante extends Persona {
    String generoMusical;
    int añosExpe;
    
    void leerCantante (){
     generoMusical=JOptionPane.showInputDialog("Digite el género musical");
     añosExpe=Integer.parseInt(JOptionPane.showInputDialog("Digite los años de experiencia"));
    }
    void mostrar (){
      JOptionPane.showMessageDialog(null,"\nEl nombre es: " + nombre +"\nedad: "+edad+"\ngenero: "+genero+"\nGenero Musical:" +generoMusical+ "\nAños de experiencia: " +añosExpe);
    }
}

