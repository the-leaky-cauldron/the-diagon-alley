package org.theleakycauldron.diagonalley.dtos;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@SuperBuilder
@AllArgsConstructor
@Getter
@Setter
public class DiagonAlleyCreateProductResponseDTO extends DiagonAlleyResponseDTO {
    private String response;
    private String uuid;
}
