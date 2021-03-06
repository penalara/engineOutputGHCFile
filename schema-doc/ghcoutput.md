# EngineOutputGHCSchema Schema

```txt
engineOutputGHCSchema
```

Schema document to format in Json the timetable created by PenalaraGHC.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                   |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ---------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghcOutput.schema.json](../out/ghcOutput.schema.json "open original schema") |

## EngineOutputGHCSchema Type

`object` ([EngineOutputGHCSchema](ghcoutput.md))

# EngineOutputGHCSchema Properties

| Property                | Type     | Required | Nullable       | Defined by                                                                                                            |
| :---------------------- | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------- |
| [date](#date)           | `string` | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-jsongenerationdate.md "engineOutputGHCSchema#/properties/date")          |
| [timetable](#timetable) | `object` | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable.md "engineOutputGHCSchema#/properties/timetable") |

## date

Date of timetable creation.


`date`

-   is required
-   Type: `string` ([JsonGenerationDate](ghcoutput-properties-jsongenerationdate.md))
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-jsongenerationdate.md "engineOutputGHCSchema#/properties/date")

### date Type

`string` ([JsonGenerationDate](ghcoutput-properties-jsongenerationdate.md))

### date Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## timetable

Object with timetable specification resolved.


`timetable`

-   is required
-   Type: `object` ([GeneratedJsonTimetable](ghcoutput-properties-generatedjsontimetable.md))
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable.md "engineOutputGHCSchema#/properties/timetable")

### timetable Type

`object` ([GeneratedJsonTimetable](ghcoutput-properties-generatedjsontimetable.md))
