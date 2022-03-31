/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogotá - Colombia)
 * Departamento de Tecnología de la Información y Comunicaciones
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Basado en un Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: Bolsa de Empleo
 * Fecha: 11 de marzo de 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package universidadean.empleo.interfaz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Es el panel que contiene los botones de extensión
 */
public class PanelExtension extends JPanel implements ActionListener {
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * El comando para el botón 1
     */
    private final String OPCION_1 = "Salir";

    private final String OPCION_2 = "OrdenarNombre";

    private final String OPCION_3 = "BusquedaBinaria";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es la referencia a la interfaz de la aplicación
     */
    private InterfazBolsaDeEmpleo principal;

    // -----------------------------------------------------------------
    // Atributos de la Interfaz
    // -----------------------------------------------------------------

    /**
     * Es el botón 1
     */
    private JButton botonOpcion1;

    private JButton botonOrdenar;

    private JButton botonBuscar;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el panel con una referencia a la ventana principal de la aplicación <br>
     * <b>post: </b> Contruyó el panel y principal = interfaz <br>
     * @param interfaz - Referencia a la ventana principal - interfaz!=null
     */
    public PanelExtension(InterfazBolsaDeEmpleo interfaz) {
        principal = interfaz;
        inicializar();
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicializa los componentes del panel <br>
     * <b>post: </b> Se inicializaron y se ubicaron los componentes del panel <br>
     */
    private void inicializar() {
        setBorder(new TitledBorder("Opciones del programa"));

        setLayout(new FlowLayout());

        botonOrdenar = new JButton("Ordenar por Nombre");
        botonOrdenar.setActionCommand(OPCION_2);
        botonOrdenar.addActionListener(this);

        add(botonOrdenar);

        botonBuscar = new JButton("Busqueda Binaria");
        botonBuscar.setActionCommand(OPCION_3);
        botonBuscar.addActionListener(this);

        add(botonBuscar);

        botonOpcion1 = new JButton("Salir");
        botonOpcion1.setActionCommand(OPCION_1);
        botonOpcion1.addActionListener(this);

        add(botonOpcion1);
    }

    /**
     * Este método se llama cuando se presiona uno de los botones
     * @param evento El evento del click en el botón. evento!=null
     */
    public void actionPerformed(ActionEvent evento) {
        String comando = evento.getActionCommand();
        if (OPCION_1.equals(comando)) {
            principal.reqFuncOpcion1();
        }
        else if (OPCION_2.equals(comando)) {
            principal.ordenarPorNombre();
        }
        else if (OPCION_3.equals(comando)) {
            principal.buscarBinario();
        }
    }

}