Feature: Banistmo websites

Scenario: Accessing the Banistmo websites
     Given Select button cookies
     When Search the aprender
     When Search the legales
     When Search the fatca y crs
     When Download “PJ-Autocertificación unificado- Fatca y CRS.pdf”
     Then Validar pdf

