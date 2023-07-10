package gov.epa.ccte.api.files.domain;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(enumAsRef = true)
public enum ImageFormat {
    PNG, SVG;
}
