# GeneratedJsonTimetable Schema

```txt
undefined#/properties/timetable
```

Object with timetable specification resolved.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                       |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghcEngineOutput.schema.json\*](../../../out/ghcEngineOutput.schema.json "open original schema") |

## timetable Type

`object` ([GeneratedJsonTimetable](ghcengineoutput-properties-generatedjsontimetable.md))

# timetable Properties

| Property                                    | Type    | Required | Nullable       | Defined by                                                                                                                                                                         |
| :------------------------------------------ | :------ | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [assignedSections](#assignedsections)       | `array` | Required | cannot be null | [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections.md "undefined#/properties/timetable/properties/assignedSections")            |
| [anonymousClassRooms](#anonymousclassrooms) | `array` | Optional | cannot be null | [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms.md "undefined#/properties/timetable/properties/anonymousClassRooms") |

## assignedSections

List of sections assigned in the Timetable.

`assignedSections`

*   is required

*   Type: `object[]` ([AssignedSection](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection.md))

*   cannot be null

*   defined in: [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections.md "undefined#/properties/timetable/properties/assignedSections")

### assignedSections Type

`object[]` ([AssignedSection](ghcengineoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection.md))

## anonymousClassRooms

Collection with anonymous classrooms created by the engine. The classrooms are grouped by set of classrooms.

`anonymousClassRooms`

*   is optional

*   Type: `object[]` ([AnonymousClassRoom](ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom.md))

*   cannot be null

*   defined in: [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms.md "undefined#/properties/timetable/properties/anonymousClassRooms")

### anonymousClassRooms Type

`object[]` ([AnonymousClassRoom](ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom.md))
