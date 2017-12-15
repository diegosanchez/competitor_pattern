# Competitor Pattern

## Donde surje

Dada una colección de elementos queremos reducirla ([reduce]() - [PF](PF)) a un único elemento de la colección buscando:
- La lógica de la selección o la política por la cuál un elemento prevalece es potestad de este (OnlyCanBeSent, CantSentXunits, etc).
- Evitar la utilización del ```if``` debido a como afecta negativamente la métrica de cobertura (ver [aquí](https://github.com/diegosanchez/competitor_pattern/wiki/Sin-Patron) los efectos negativos)

Código a partir del cuál salimos en búsqueda de la mejora:

```java
public Entity winner() {
    Entity result = null;

    for( Entity e : this.entities) {
        if ( e.happens() ) {
            result = e;
            break;
        }
    }

    if ( result == null ) {
        result = new NullLeakEntity();
    }

    return result;
};
```

## Qué efectos negativos tiene este fragmente de código (snippet of code) en la calidad?

![cobertura][cobertura]


## Alternativa

[Wiki][1]

## Ejecutar projecto en java

1. Clonar repositorio: ```git clone git@github.com:diegosanchez/competitor_pattern.git```
2. Ejecución de cobertura: ```mvn cobertura:cobertura```
3. Ver reporte: ```open target/site/cobertura/index.html```


[1]: https://github.com/diegosanchez/competitor_pattern/wiki
[cobertura]: https://raw.githubusercontent.com/wiki/diegosanchez/competitor_pattern/without_pattern/java_coverage.png
