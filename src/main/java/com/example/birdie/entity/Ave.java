package com.example.birdie.entity;

import jakarta.persistence.*;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Entity
public class Ave {

    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ave")
    private Integer id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String cientifico;

    @NotBlank
    private String descripcion;

    private String youtubeVideoId;

    private String estadoConservacion;

    @NotBlank
    private String rutaFoto;

    @NotEmpty
    @ManyToMany(fetch = FetchType.LAZY)  // COMPROBAR SI PUEDO ELIMINAR ESTO
    @JoinTable(name = "habitat_ave", joinColumns = @JoinColumn(name = "id_ave"), inverseJoinColumns = @JoinColumn(name = "id_habitat"))
    private List<Habitat> habitats;

    @Transient
    private MultipartFile portada;


    // Constructores


    public Ave() {
    }

    public Ave(Integer id, String nombre, String cientifico, String descripcion, String youtubeVideoId, String estadoConservacion, String rutaFoto, List<Habitat> habitats, MultipartFile portada) {
        this.id = id;
        this.nombre = nombre;
        this.cientifico = cientifico;
        this.descripcion = descripcion;
        this.youtubeVideoId = youtubeVideoId;
        this.estadoConservacion = estadoConservacion;
        this.rutaFoto = rutaFoto;
        this.habitats = habitats;
        this.portada = portada;
    }

    public Ave(String nombre, String cientifico, String descripcion, String youtubeVideoId, String estadoConservacion, String rutaFoto, List<Habitat> habitats, MultipartFile portada) {
        this.nombre = nombre;
        this.cientifico = cientifico;
        this.descripcion = descripcion;
        this.youtubeVideoId = youtubeVideoId;
        this.estadoConservacion = estadoConservacion;
        this.rutaFoto = rutaFoto;
        this.habitats = habitats;
        this.portada = portada;
    }

    // Getter y Setter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCientifico() {
        return cientifico;
    }

    public void setCientifico(String cientifico) {
        this.cientifico = cientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getYoutubeVideoId() {
        return youtubeVideoId;
    }

    public void setYoutubeVideoId(String youtubeVideoId) {
        this.youtubeVideoId = youtubeVideoId;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public List<Habitat> getHabitats() {
        return habitats;
    }

    public void setHabitats(List<Habitat> habitats) {
        this.habitats = habitats;
    }

    public MultipartFile getPortada() {
        return portada;
    }

    public void setPortada(MultipartFile portada) {
        this.portada = portada;
    }
}