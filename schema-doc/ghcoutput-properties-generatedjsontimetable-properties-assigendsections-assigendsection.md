# AssigendSection Schema

```txt
engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items
```

Section with one or more session (or on call hours) assigned.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                     |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghcOutput.schema.json\*](../out/ghcOutput.schema.json "open original schema") |

## items Type

`object` ([AssigendSection](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection.md))

# AssigendSection Properties

| Property                            | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                |
| :---------------------------------- | --------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refFrame](#refframe)               | `string`  | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-refframe.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/refFrame")               |
| [day](#day)                         | `integer` | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-day.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/day")                         |
| [realIndex](#realindex)             | `integer` | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-realindex.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/realIndex")             |
| [fictionalIndex](#fictionalindex)   | `integer` | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-fictionalindex.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/fictionalIndex")   |
| [sessionsAsigned](#sessionsasigned) | `array`   | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/sessionsAsigned") |

## refFrame

Frame's section of timetable with assignation.


`refFrame`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-refframe.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/refFrame")

### refFrame Type

`string`

## day

Day of the week when is located the section.


`day`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-day.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/day")

### day Type

`integer`

## realIndex

Position on the day, of the real section, in the frame.


`realIndex`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-realindex.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/realIndex")

### realIndex Type

`integer`

## fictionalIndex

Position on the day, of the ficticial section, in the frame.


> The engine make the ficticial sections, as a division of Real Sections.
>

`fictionalIndex`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-fictionalindex.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/fictionalIndex")

### fictionalIndex Type

`integer`

## sessionsAsigned

List of, session and on call hours, assigned at the section.


`sessionsAsigned`

-   is required
-   Type: `object[]` ([SessionAsigned](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned-sessionasigned.md))
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections/items/properties/sessionsAsigned")

### sessionsAsigned Type

`object[]` ([SessionAsigned](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection-properties-sessionsasigned-sessionasigned.md))
