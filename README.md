# Competitor Pattern

## Donde surje

Dada una colección de elementos queremos reducirla ([reduce]() - [PF](PF)) a un único elemento de la colección buscando:
- La lógica de la selección o la política por la cuál un elemento prevalece es potestad de este (OnlyCanBeSent, CantSentXunits, etc).
- Evitar la utilización del ```if``` debido a como afecta negativamente la métrica de cobertura (ver [aquí](https://github.com/diegosanchez/competitor_pattern/wiki/Sin-Patron) los efectos negativos)

Código a partir del cuál salimos en búsqueda de la mejora:

```java
public static int getInconsistencyValue(Environmet env) {
    Inconsistency inconsistencies[] = {
            new OnlyCanBeSent( env ),
            new CantSentXunits( env ),
            new AgreeAgree( env ),
            new OnlyToAgree( env ),
            new OnlyPuis( env )
    };

    for( Inconsistency i : inconsistencies) {
        if ( !i.happens().equals( none ) ) {
            inconsistency = i;
            break;
        }
    };

    return inconsistency.getNumber();

}
```

### Ejecutar projecto en java

1. Clonar repositorio: ```git clone git@github.com:diegosanchez/competitor_pattern.git```
2. Ejecución de cobertura: ```mvn cobertura:cobertura```
3. Ver reporte: ```open target/site/cobertura/index.html```

## Alternativa

[Wiki][1]

[1]: https://github.com/diegosanchez/competitor_pattern/wiki
