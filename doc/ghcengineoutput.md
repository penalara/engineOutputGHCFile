# EngineOutputGHCSchema Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/common/ghcEngineOutput.schema.json
```

Schema document to format in Json the timetable created by PenalaraGHC.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                     |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :--------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghcEngineOutput.schema.json](../../../out/ghcEngineOutput.schema.json "open original schema") |

## EngineOutputGHCSchema Type

`object` ([EngineOutputGHCSchema](ghcengineoutput.md))

# EngineOutputGHCSchema Properties

| Property                | Type      | Required | Nullable       | Defined by                                                                                                                                                                                            |
| :---------------------- | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [date](#date)           | `string`  | Optional | cannot be null | [EngineOutputGHCSchema](ghcengineoutput-properties-jsongenerationdate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/common/ghcEngineOutput.schema.json#/properties/date")          |
| [weight](#weight)       | `integer` | Required | cannot be null | [EngineOutputGHCSchema](ghcengineoutput-properties-jsongenerationdate-1.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/common/ghcEngineOutput.schema.json#/properties/weight")      |
| [timetable](#timetable) | `object`  | Required | cannot be null | [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/common/ghcEngineOutput.schema.json#/properties/timetable") |

## date

Date of result creation.

`date`

*   is optional

*   Type: `string` ([JsonGenerationDate](ghcengineoutput-properties-jsongenerationdate.md))

*   cannot be null

*   defined in: [EngineOutputGHCSchema](ghcengineoutput-properties-jsongenerationdate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/common/ghcEngineOutput.schema.json#/properties/date")

### date Type

`string` ([JsonGenerationDate](ghcengineoutput-properties-jsongenerationdate.md))

### date Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## weight

Weight of the result according to the non-mandatory conditions not fulfilled.

`weight`

*   is required

*   Type: `integer` ([JsonGenerationDate](ghcengineoutput-properties-jsongenerationdate-1.md))

*   cannot be null

*   defined in: [EngineOutputGHCSchema](ghcengineoutput-properties-jsongenerationdate-1.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/common/ghcEngineOutput.schema.json#/properties/weight")

### weight Type

`integer` ([JsonGenerationDate](ghcengineoutput-properties-jsongenerationdate-1.md))

## timetable

Object with timetable specification resolved.

`timetable`

*   is required

*   Type: `object` ([GeneratedJsonTimetable](ghcengineoutput-properties-generatedjsontimetable.md))

*   cannot be null

*   defined in: [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/common/ghcEngineOutput.schema.json#/properties/timetable")

### timetable Type

`object` ([GeneratedJsonTimetable](ghcengineoutput-properties-generatedjsontimetable.md))
